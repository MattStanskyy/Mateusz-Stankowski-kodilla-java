package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {

    public String findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw", false);
        flights.put("Szczecin", false);
        flights.put("Poznan", true);

        if (!flights.get(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        }
        return flight.getArrivalAirport();
    }

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("Warsaw", "Szczecin");

        try {
            flightFinder.findFlight(flight);
            System.out.println("You can plan this trip");
        } catch (RouteNotFoundException e) {
            System.out.println(e.getClass().getSimpleName() + e.getMessage());
        }
    }
}
