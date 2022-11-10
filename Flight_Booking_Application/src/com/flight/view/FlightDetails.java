package com.flight.view;

import com.flight.model.Flight;

public class FlightDetails {
	
    public void display(Flight flight) {
    	
    	System.out.println(flight.getFlightId());
    	System.out.println(flight.getFlightName());
    	System.out.println(flight.getArivalTime());
    	System.out.println(flight.getDepartureTime());
    	System.out.println(flight.getRoutes());
    	System.out.println(flight.getAmount());
    	System.out.println(flight.getSeats()+"\n");   	
    }
}
