package com.flight.model;

public class Passanger {
	
	private int passangerId;
	private String passangerName;
	private int age;
	private String gender;
	private String arrivalPlace;
	private String departurePlace;
	private float amount;

	public int getPassangerId() {
		return passangerId;
	}

	public void setPassangerId(int passangerId) {
		this.passangerId = passangerId;
	}

	public String getPassangerName() {
		return passangerName;
	}

	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getArrivalPlase() {
		return arrivalPlace;
	}

	public void setArrivalPlase(String arrivalPlace) {
		this.arrivalPlace = arrivalPlace;
	}

	public String getDeparturePlase() {
		return departurePlace;
	}

	public void setDeparturePlase(String departurePlace) {
		this.departurePlace = departurePlace;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}
