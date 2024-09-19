package factory;

import java.util.Random;

import Model.ChickenDumpling;
import Model.Dumpling;

public class BeefDumplingStore extends DumplingStore {

	@Override
	public Dumpling createDumpling() {
		String materials = "Beef, etc";
		String name = "Beef Dumpling";
		Integer price = new Random().nextInt(2) == 0 ? 50000 : 70000;
		return new ChickenDumpling(materials, name, price);
	}

}
