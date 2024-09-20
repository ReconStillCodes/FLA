package structural.facade;

public class Client {

	public Client() {
		FakerFacade faker = new FakerFacade();
		System.out.println(faker.name());
		System.out.println(faker.email());
	}

	public static void main(String[] args) {
		new Client();

	}

}
