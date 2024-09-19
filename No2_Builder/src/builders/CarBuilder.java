package builders;

import models.engine.Engine;
import models.wheel.Wheel;

public interface CarBuilder {
	public void setEngine(Engine engine);

	public void setWheel(Wheel wheel);
}
