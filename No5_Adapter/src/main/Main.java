package main;

import model.ChargerAdapter;
import model.ChargerB;
import model.ChargerC;
import model.HandphoneC;

public class Main {

	public Main() {
		HandphoneC hp = new HandphoneC("Samsung");

		ChargerC chargerC = new ChargerC();
		ChargerB chargerB = new ChargerB();
		ChargerAdapter chargerAdapter = new ChargerAdapter(chargerB); // Make an Adapter

		System.out.println("Battery : " + hp.getBattery());
		hp.playing();
		System.out.println("Battery : " + hp.getBattery());
		// hp.charging(chargerC); //Original
		// hp.charging(chargerB); //Not compatible
		hp.charging(chargerAdapter);
		System.out.println("Battery : " + hp.getBattery());
	}

	public static void main(String[] args) {
		new Main();

	}

}
