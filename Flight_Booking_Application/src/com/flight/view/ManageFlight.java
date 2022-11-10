package com.flight.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.flight.controller.FlightController;

public class ManageFlight {
	private Scanner scanner = new Scanner(System.in);

	public void addFlight() {
		System.out.println("Enter flight name :");
		String flightName = scanner.nextLine();
		System.out.println("Enter routes :");
		ArrayList<String> flightRoutes = new ArrayList<String>();
		int count = scanner.nextInt();
		while (count >= 0) {
			System.out.println("");
			flightRoutes.add(scanner.next());
			count--;
		}
		System.out.println("AravialTime");
		String aravialDate = scanner.nextLine();
		System.out.println("departureTime");
		String departureTime = scanner.nextLine();
		System.out.println("Enter seat count :");
		int seatsCount = scanner.nextInt();
		System.out.println("Enter amount :");
		float amount = scanner.nextFloat();
		new FlightController().toAddNewFlight(flightName, flightRoutes, aravialDate, departureTime, seatsCount, amount);
	}

	public void flightCreated(String alert) {
		System.out.println(alert);
	}

}
