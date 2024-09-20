package structural.facade;

import java.util.Random;

public class NameRandomizer implements Randomizer {

	String[] names = { "Name A", "Name B", "Name C", "Name D", "Name E" };

	Random random = new Random();

	@Override
	public String random() {
		String name = names[random.nextInt(names.length)];
		return name;
	}

}
