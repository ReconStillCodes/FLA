package main;

import factory.BeefDumplingStore;
import factory.ChickenDumplingStore;
import factory.DumplingStore;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		DumplingStore beefStore = new BeefDumplingStore();
		beefStore.orderDumpling();

		System.out.println("");

		DumplingStore chickenStore = new ChickenDumplingStore();
		chickenStore.orderDumpling();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
