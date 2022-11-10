package com.flight.view;

import java.util.Scanner;

import com.flight.controller.ValideLogin;

public class LoginView {
	private Scanner scanner = new Scanner(System.in);

	public void init() {
		System.out.println("Welcome to flight booking application");
		new LoginView().checkLogin();

	}

	public void checkLogin() {
		System.out.println("\n1.Admin\n2.User\nEnter option!!");
		String option = scanner.nextLine();
		switch (option) {
		case "1":
			boolean isValied = true;
			while (isValied) {
				System.out.println("Enter your name");
				String name = scanner.nextLine();
				System.out.println("Enter your password");
				String password = scanner.nextLine();
				if (new ValideLogin().checkDetails(name, password)) {
					isValied = false;
				}
			}
			new MainView().adminMenu();
			break;
		case "2":
			new MainView().userMenu();
			break;
		}

	}

}
