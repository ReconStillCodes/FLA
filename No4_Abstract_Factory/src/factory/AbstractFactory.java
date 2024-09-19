package factory;

import model.Pants;
import model.Shirt;

public interface AbstractFactory {
	Shirt createShirt();

	Pants createPants();
}
