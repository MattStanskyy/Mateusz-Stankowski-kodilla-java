package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsDatabase {

    private Set<FlightService> flightServiceSet = new HashSet<>();

    public Set<FlightService> getFlightSet() {
        flightServiceSet.add(new FlightService("GDANSK", "WROCLAW"));
        flightServiceSet.add(new FlightService("WARSZAWA", "GDANSK"));
        flightServiceSet.add(new FlightService("WROCLAW", "WARSZAWA"));
        flightServiceSet.add(new FlightService("POZNAN", "WARSZAWA"));
        flightServiceSet.add(new FlightService("GDANSK", "RZESZOW"));
        flightServiceSet.add(new FlightService("KATOWICE", "GDANSK"));
        return flightServiceSet;
    }
}
