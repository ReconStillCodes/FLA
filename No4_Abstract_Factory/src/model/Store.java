package model;

import factory.AbstractFactory;

public class Store {
	AbstractFactory factory;
	Shirt shirt;
	Pants pants;

	public Store(AbstractFactory factory) {
		this.factory = factory;
	}

	public void showAllItems() {
		shirt = factory.createShirt();
		pants = factory.createPants();

		System.out.println("Shirt : " + shirt.getName());
		System.out.println("Pants : " + pants.getName());
	}

}
