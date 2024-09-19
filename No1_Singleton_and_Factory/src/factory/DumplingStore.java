package factory;

import Model.Dumpling;

public abstract class DumplingStore {
	public Dumpling orderDumpling() {
		System.out.println("Creating Dumpling!");
		Dumpling dumpling = createDumpling();
		dumpling.makeDumpling();
		System.out.println("Serving Dumpling!");
		return dumpling;
	}

	// Factory Method

	public abstract Dumpling createDumpling();
}
