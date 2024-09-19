package main;

import builders.Director;
import builders.FamilyCarBuilder;
import builders.SportCarBuilder;
import models.car.FamilyCar;
import models.car.SportCar;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub

		SportCarBuilder sportCarBuilder = new SportCarBuilder();
		Director director = new Director(sportCarBuilder);
		director.buildSportCar();

		SportCar sportCar = sportCarBuilder.getCar();
		System.out.println(sportCar.getEngine().getName());

		FamilyCarBuilder familyCarBuilder = new FamilyCarBuilder();
		director = new Director(familyCarBuilder);
		director.buildFamilyCar();
//
		FamilyCar familyCar = familyCarBuilder.getCar();
		System.out.println(familyCar.getEngine().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
