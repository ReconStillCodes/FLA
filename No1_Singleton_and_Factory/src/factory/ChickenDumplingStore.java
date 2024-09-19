package factory;

import java.util.Random;

import Model.ChickenDumpling;
import Model.Dumpling;

public class ChickenDumplingStore extends DumplingStore {

	@Override
	public Dumpling createDumpling() {
		String materials = "Chicken, etc";
		String name = "Chicken Dumpling";
		Integer price = new Random().nextInt(2) == 0 ? 40000 : 60000;
		return new ChickenDumpling(materials, name, price);
	}

}
