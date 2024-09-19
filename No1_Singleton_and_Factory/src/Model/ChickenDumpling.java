package Model;

public class ChickenDumpling extends Dumpling {

	public ChickenDumpling(String ingredients, String name, Integer price) {
		super(ingredients, name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Dumpling makeDumpling() {
		System.out.println("Making Dumpling ...");
		return null;
	}

}
