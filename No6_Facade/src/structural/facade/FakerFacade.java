package structural.facade;

public class FakerFacade {
	NameRandomizer nameRand = new NameRandomizer();
	EmailRandomizer emailRand = new EmailRandomizer();

	public String name() {
		return nameRand.random();
	}

	public String email() {
		return emailRand.random();
	}
}
