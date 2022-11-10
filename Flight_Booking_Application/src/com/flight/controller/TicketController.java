package com.flight.controller;

import java.util.List;

import com.flight.model.Flight;
import com.flight.model.Passanger;
import com.flight.repository.Database;
import com.flight.view.ManageUser;

public class TicketController {

	public void cancelTicket() {

	}

	public boolean booking(int flightId, String passangerName, int passangerAge, String arivalPlace,
			String depaturePlace) {
		List<Flight> flightDetails = Database.getInstance().getFlightDetails();
		Passanger passanger = new Passanger();
		boolean isAvilable = true;
		for (Flight flight : flightDetails) {
			if (flight.getSeats() != 0) {
				isAvilable = false;
				float amount = 1000.00f;
				passanger.setAge(passangerAge);
				passanger.setAmount(1000.0f);
				passanger.setArrivalPlase(arivalPlace);
				passanger.setDeparturePlase(depaturePlace);
				passanger.setPassangerName(passangerName);
				passanger.setGender(depaturePlace);
				ManageUser mangeUser = new ManageUser();
				mangeUser.payAmount(passanger, amount);
			}
		}
		if (isAvilable) {
			return true;
		} else {
			return false;
		}
	}

}
