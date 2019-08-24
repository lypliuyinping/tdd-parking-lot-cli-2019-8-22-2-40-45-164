package com.oocl.cultivation;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParkingBoy {

    private final ParkingLot parkingLot;
    private String lastErrorMessage;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
    	  // TODO: Please implement the method
    	ParkingTicket ticket=parkingLot.park(car);
    	return ticket; 
    }

    public Car fetch(ParkingTicket ticket) {
        // TODO: Please implement the method
        if (ticket==null) {
        	lastErrorMessage="Please provide your parking ticket."; 
			return null;
		}
        Car car=parkingLot.fetch(ticket);
        return car;
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
}
