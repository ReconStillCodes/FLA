package main;

import database.proxy.DatabaseExecutorProxy;
import database.proxy.IExecutable;
import model.User;

public class Main {

	public Main() {
		User admin = new User("Admin");
		User user = new User("Not Admin");

		IExecutable adminRole = new DatabaseExecutorProxy(admin);
		IExecutable userRole = new DatabaseExecutorProxy(user);

		System.out.println("Admin Role");
		System.out.println("====================");

		try {
			adminRole.executeQuery("SELECT * FROM database");
			adminRole.executeQuery("UPDATE database SET A = B");
			adminRole.executeQuery("DELETE * FROM database");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println();
		System.out.println("User Role");
		System.out.println("====================");

		try {
			userRole.executeQuery("SELECT * FROM database");
			userRole.executeQuery("UPDATE database SET A = B");
			userRole.executeQuery("DELETE * FROM database");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new Main();

	}

}
