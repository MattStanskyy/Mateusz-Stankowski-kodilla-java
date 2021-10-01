package com.kodilla.good.patterns.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightsSearcher {

    private Set<FlightService> flightService = new FlightsDatabase().getFlightSet();

    public Set<FlightService> searchingByDepartureAirport(String airport) {
        flightService.stream()
                .filter(f -> f.getDepartureAirport().equals(airport))
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        return flightService;
    }

    public Set<FlightService> searchingByArrivalAirport(String airport) {
        flightService.stream()
                .filter(f -> f.getArrivalAirport().equals(airport))
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        return flightService;
    }

    public Set<FlightService> searchingByConnectionAirports(String fromAirport, String toAirport) {
        Set<FlightService> airportA = flightService.stream()
                .filter(f -> f.getDepartureAirport().equals(fromAirport))
                .collect(Collectors.toSet());
        Set<FlightService> airportB = flightService.stream()
                .filter(f -> f.getArrivalAirport().equals(toAirport))
                .collect(Collectors.toSet());
        for(FlightService flightService : airportA) {
            for (FlightService flightService1 : airportB) {
                if (flightService.getArrivalAirport().equals(flightService1.getDepartureAirport())) {
                    System.out.println(flightService);
                    System.out.println(flightService1);
                }
            }
        }
        return flightService;
    }
}
