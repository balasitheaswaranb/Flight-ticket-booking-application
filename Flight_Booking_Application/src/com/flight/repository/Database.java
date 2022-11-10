package com.flight.repository;

import java.util.ArrayList;
import java.util.List;

import com.flight.model.Flight;
import com.flight.model.Passanger;
import com.flight.model.Ticket;

public class Database {
	private static Database database;

	private List<Flight> flightDetails;
	private List<Passanger> passangerDetails;
	private List<Ticket> ticketList;

	private Database() {
		flightDetails = new ArrayList<Flight>();
		passangerDetails = new ArrayList<Passanger>();
		ticketList = new ArrayList<Ticket>();
	}

	public static Database getInstance() {
		if (database == null) {
			database = new Database();
		}
		return database;
	}

	public List<Flight> getFlightDetails() {
		return flightDetails;
	}

	public void setFlightDetails(Flight flightDetails) {
		this.flightDetails.add(flightDetails);
	}

	public List<Passanger> getPassangerDetails() {
		return passangerDetails;
	}

	public void setPassangerDetails(Passanger passangerDetails) {
		this.passangerDetails.add(passangerDetails);
	}

	public List<Ticket> getTicketList() {
		return ticketList;
	}

	public void setTicketList(Ticket ticketList) {
		this.ticketList.add(ticketList);
	}

}
