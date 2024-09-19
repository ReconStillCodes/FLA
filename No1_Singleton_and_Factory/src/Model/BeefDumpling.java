package Model;

public class BeefDumpling extends Dumpling {

	public BeefDumpling(String ingredients, String name, Integer price) {
		super(ingredients, name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Dumpling makeDumpling() {
		System.out.println("Making Beef Dumpling ...");
		return null;
	}

}
