package main;

import java.util.Vector;

import models.Products;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		Products productPrototype = new Products("1", "Samsung S20", 10000000);
		Vector<Products> products = new Vector<>();

		for (int i = 0; i < 100; i++) {
//			products.add(new Products(productPrototype.getBarcode(), productPrototype.getName(),
//					productPrototype.getPrice()));

			// Dapat error bila menambahkan attribut baru atau menggunakan attribute private
			// (tanpa setter or getter)

			try {
				products.add((Products) productPrototype.clone());
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		products.get(0).print();
		products.get(1).print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
