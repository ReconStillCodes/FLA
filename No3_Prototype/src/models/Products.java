package models;

public class Products implements Cloneable {

	protected String barcode, name;
	protected int price;

	public Products() {
		// TODO Auto-generated constructor stub
	}

	public Products(String barcode, String name, int price) {
		super();
		this.barcode = barcode;
		this.name = name;
		this.price = price;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void print() {
		System.out.println(name + " " + barcode + " " + price);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
