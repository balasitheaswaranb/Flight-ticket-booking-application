package com.flight.view;

import java.util.Scanner;

import com.flight.controller.FlightController;
import com.flight.controller.TicketController;
import com.flight.model.Passanger;

public class ManageUser {
	private Scanner scanner = new Scanner(System.in);

	public void ticketBooking() {
		System.out.println("Enter your name");
		String passangerName = scanner.nextLine();
		System.out.println("Enter your age");
		int passangerAge = scanner.nextInt();
		System.out.println("Enter your arrival place");
		String arivalPlace = scanner.nextLine();
		System.out.println("Enter your depature place");
		String depaturePlace = scanner.nextLine();
		FlightController flightControl = new FlightController();
		flightControl.listOfFlightDetails(arivalPlace, depaturePlace);
		System.out.println("Enter your flight number");
		int flightId = scanner.nextInt();
		TicketController ticketControl = new TicketController();
		ticketControl.booking(flightId, passangerName, passangerAge, arivalPlace, depaturePlace);

	}

	public void flightRouts() {
		System.out.println("Enter arrival place");
		String arivalPlase = scanner.nextLine();
		System.out.println("Enter your depature place");
		String depaturePlase = scanner.nextLine();
		FlightController flightControler = new FlightController();
		flightControler.findFlightRouts(arivalPlase, depaturePlase);
	}

	public void cancalTicket() {
		System.out.println("Enter your ticket number");
		int ticketNumber = scanner.nextInt();

	}

	public void payAmount(Passanger passanger, float amount) {

	}

}
