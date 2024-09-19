package models.car;

import models.engine.Engine;
import models.wheel.Wheel;

public abstract class Car {
	protected Engine engine;
	protected Wheel wheel;

	public Car(Engine engine, Wheel wheel) {
		super();
		this.engine = engine;
		this.wheel = wheel;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

}
