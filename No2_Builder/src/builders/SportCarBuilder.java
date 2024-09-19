package builders;

import models.car.SportCar;
import models.engine.Engine;
import models.wheel.Wheel;

public class SportCarBuilder implements CarBuilder {

	private SportCar sportCar;

	public SportCarBuilder() {
		sportCar = new SportCar();
	}

	@Override
	public void setEngine(Engine engine) {
		// TODO Auto-generated method stub
		sportCar.setEngine(engine);
	}

	@Override
	public void setWheel(Wheel wheel) {
		// TODO Auto-generated method stub
		sportCar.setWheel(wheel);
	}

	public SportCar getCar() {
		return sportCar;
	}

}
