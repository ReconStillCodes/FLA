package main;

import factory.AddidasFactory;
import factory.PoloFactory;
import model.Store;

public class Main {

	public Main() {
		Store poloStore = new Store(new PoloFactory());
		Store addidasStore = new Store(new AddidasFactory());

		System.out.println("First Store");
		poloStore.showAllItems();
		addidasStore.showAllItems();
	}

	public static void main(String[] args) {
		new Main();

	}

}
