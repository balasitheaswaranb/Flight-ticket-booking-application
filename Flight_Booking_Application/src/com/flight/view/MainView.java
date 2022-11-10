package com.flight.view;

import java.util.Scanner;

public class MainView {

	private Scanner scanner = new Scanner(System.in);

	public void adminMenu() {

		System.out.println("Enter your option\n1.Add flight \n2 Add routes\n3 Search passeners\n4.Exit");
		String option = scanner.nextLine();
		switch (option) {
		case "1":
			new ManageFlight().addFlight();
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
    		new LoginView().checkLogin();
			break;
		default:
			System.out.println("invalid!!!");
		}
		this.adminMenu();
	}

	public void userMenu() {
		ManageUser manageUser = new ManageUser();
		System.out.println(
				"1. Ticket booking\n2.List of flight \n3.Cancel tickets\n4 Back to login\nEnter your option...");
		String option = scanner.nextLine();
		switch (option) {
		case "1":
			manageUser.ticketBooking();
			break;
		case "2":
			manageUser.flightRouts();
			break;
		case "3":
			manageUser.cancalTicket();
			break;
		case "4":
			LoginView login = new LoginView();
			login.checkLogin();
			break;
		default:
			System.out.println("Invalid");
			this.userMenu();

		}

	}
}
