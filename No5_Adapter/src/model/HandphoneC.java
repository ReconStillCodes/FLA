package model;

public class HandphoneC {

	private Integer battery;
	private String brand;

	public HandphoneC(String brand) {
		this.battery = 100;
		this.brand = brand;
	}

	public void playing() {
		System.out.println(brand + " playing games!");
		while (battery > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.print(".");
			battery -= 20;
		}

		System.out.println();
	}

	public void charging(ChargerC charger) {
		System.out.println(brand + " playing games!");
		while (battery < 100) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.print(".");
			battery += charger.getPowerCharger();
		}

		System.out.println();
	}

	public Integer getBattery() {
		return battery;
	}

	public void setBattery(Integer battery) {
		this.battery = battery;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
