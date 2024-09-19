package model;

public class ChargerAdapter extends ChargerC {

	private ChargerB chargerB;

	public ChargerAdapter(ChargerB chargerB) {
		this.chargerB = chargerB;
	}

	public Integer getPowerCharger() {
		return chargerB.getPowerCharger();
	}

}
