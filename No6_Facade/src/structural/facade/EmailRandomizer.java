package structural.facade;

import java.util.Random;

public class EmailRandomizer implements Randomizer {

	String[] emails = { "AAA@gmail.com", "BBB@gmail.com", "CCC@gmail.com", "DDD@gmail.com", "EEE@gmail.com" };

	Random random = new Random();

	@Override
	public String random() {
		String email = emails[random.nextInt(emails.length)];
		return email;
	}

}
