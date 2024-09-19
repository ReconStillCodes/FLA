package builders;

import models.car.FamilyCar;
import models.engine.Engine;
import models.wheel.Wheel;

public class FamilyCarBuilder implements CarBuilder {
	private FamilyCar familyCar;

	public FamilyCarBuilder() {
		familyCar = new FamilyCar();
	}

	@Override
	public void setEngine(Engine engine) {
		// TODO Auto-generated method stub
		familyCar.setEngine(engine);
	}

	@Override
	public void setWheel(Wheel wheel) {
		// TODO Auto-generated method stub
		familyCar.setWheel(wheel);
	}

	public FamilyCar getCar() {
		return familyCar;
	}

}
