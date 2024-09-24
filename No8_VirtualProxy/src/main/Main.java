package main;

import image.IDisplayable;
import image.ImageDisplayProxy;

public class Main {

	public Main() {
		// Code

		IDisplayable dog_img = new ImageDisplayProxy("dog.png");
		IDisplayable cat_img = new ImageDisplayProxy("cat.png");

		System.out.println("Dog Image");
		System.out.println("=====================");
		dog_img.displayImage(); // 1
		dog_img.displayImage(); // 2
		dog_img.displayImage(); // 3

		System.out.println("");

		System.out.println("Cat Image");
		System.out.println("=====================");
		cat_img.displayImage(); // 1
		cat_img.displayImage(); // 2
		cat_img.displayImage(); // 3

	}

	public static void main(String[] args) {
		new Main();

	}

}
