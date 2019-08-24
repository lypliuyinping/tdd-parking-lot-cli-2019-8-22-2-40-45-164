package com.oocl.cultivation;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.logging.ErrorManager;

public class ParkingBoy {

    private final ParkingLot parkingLot;
    private String lastErrorMessage;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
    	  // TODO: Please implement the method
    	ParkingTicket ticket=parkingLot.park(car);
    	if (ticket!=null) {
    		lastErrorMessage=null;	
		}
    	if (this.parkingLot.getAvailableParkingPosition()<1) {
    		lastErrorMessage="The parking lot is full.";
    		return null;
		}
    	return ticket; 
    }

    public Car fetch(ParkingTicket ticket) {
        // TODO: Please implement the method
        if (ticket==null) {
        	lastErrorMessage="Please provide your parking ticket."; 
			return null;
		}
        Car car=parkingLot.fetch(ticket);
        if (car==null) {
        	lastErrorMessage="Unrecognized parking ticket.";
		}
        return car;
        
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
}
