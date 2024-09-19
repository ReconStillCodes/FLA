package factory;

import model.AddidasPants;
import model.AddidasShirt;
import model.Pants;
import model.Shirt;

public class AddidasFactory implements AbstractFactory {

	public AddidasFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Shirt createShirt() {
		// TODO Auto-generated method stub
		return new AddidasShirt();
	}

	@Override
	public Pants createPants() {
		// TODO Auto-generated method stub
		return new AddidasPants();
	}

}
