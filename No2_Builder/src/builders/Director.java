package builders;

import models.engine.InlineEngine;
import models.engine.VEngine;
import models.wheel.RFTWheel;
import models.wheel.RadialWheel;

public class Director {

	private CarBuilder carBuilder;

	public Director(CarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}

	public Director() {

	};

	public void buildSportCar() {
		this.carBuilder.setEngine(new VEngine("V12", 20000000, 2000));
		this.carBuilder.setWheel(new RFTWheel("Bridgestone Sport", "Black", 15000000));
	}

	public void buildFamilyCar() {
		this.carBuilder.setEngine(new InlineEngine("Inline-four", 10000000, 1500));
		this.carBuilder.setWheel(new RadialWheel("GT Radial", "Blue", 10000000));
	}
}
