package factory;

import model.Pants;
import model.PoloPants;
import model.PoloShirt;
import model.Shirt;

public class PoloFactory implements AbstractFactory {

	public PoloFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Shirt createShirt() {
		// TODO Auto-generated method stub
		return new PoloShirt();
	}

	@Override
	public Pants createPants() {
		// TODO Auto-generated method stub
		return new PoloPants();
	}

}
