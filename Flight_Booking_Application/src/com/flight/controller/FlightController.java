package com.flight.controller;

import java.util.ArrayList;
import java.util.List;

import com.flight.model.Flight;
import com.flight.repository.Database;
import com.flight.view.FlightDetails;


public class FlightController {
	 
	public void listOfFlightDetails(String arivalPlace, String depaturePlace) {
		FlightDetails viewFlightDetails=new FlightDetails();
		List<Flight> flightDetails = Database.getInstance().getFlightDetails();
		for(Flight flight:flightDetails) {
			List<String> flightRouts=flight.getRoutes();
				if(flightRouts.contains(arivalPlace)&&flightRouts.contains(depaturePlace)) {
					viewFlightDetails.display(flight);
			}
		}
	}

	public void findFlightRouts(String arivalPlace, String depaturePlace) {
		
	}
	public void toAddNewFlight(String name, ArrayList<String> flightRouts, String aravialDate, String departureTime,int seat,float amount) {
		int flightId=0;
		Flight flight = new Flight();
		flight.setFlightId(flightId);
		flight.setFlightName(name);
		flight.setArivalTime(aravialDate);
		flight.setDepartureTime(departureTime);
		flight.setRoutes(flightRouts);
		flight.setSeats(seat);
		flight.setAmount(amount);
        Database.getInstance().setFlightDetails(flight);
//		if (true) {
////			createFlightView.flightCreated("Flight Created");
//		} else {
////			createFlightView.flightCreated("Flight not Created");
//		}
	}

}
