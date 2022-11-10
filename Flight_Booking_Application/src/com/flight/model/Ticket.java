package com.flight.model;

public class Ticket {
	private int ticketNumber;
	private int flightId;
	private int passangerId;
	private String arrivalPlace;
	private String departurePlace;
	private float amount;

	public Ticket(int ticketNo, int flightId, int passangerId, String arivalPlase, String departurePlace,
			float amount) {
		super();
		this.ticketNumber = ticketNo;
		this.flightId = flightId;
		this.passangerId = passangerId;
		this.arrivalPlace = arivalPlase;
		this.departurePlace = departurePlace;
		this.amount = amount;
	}

	public int getTicketNo() {
		return ticketNumber;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNumber = ticketNo;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public int getPassangerId() {
		return passangerId;
	}

	public void setPassangerId(int passangerId) {
		this.passangerId = passangerId;
	}

	public String getArivalPlase() {
		return arrivalPlace;
	}

	public void setArivalPlase(String arivalPlase) {
		this.arrivalPlace = arivalPlase;
	}

	public String getDeparturePlase() {
		return departurePlace;
	}

	public void setDeparturePlase(String departurePlase) {
		this.departurePlace = departurePlase;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}
