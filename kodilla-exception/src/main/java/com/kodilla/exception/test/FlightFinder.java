package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw", true);
        flights.put("Szczecin", true);
        flights.put("Poznan", true);
        flights.put("Cracow", true);
        flights.put("Rzeszow", true);

        if (flights.containsKey(flight.getArrivalAirport())) {
            return flights.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException();
        }
    }

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("Warsaw", "Wroclaw");

        try {
            flightFinder.findFlight(flight);
            System.out.println("You can plan this trip");
        } catch (RouteNotFoundException e) {
            System.out.println(e.getClass().getSimpleName() + e.getMessage());
        }
    }
}
