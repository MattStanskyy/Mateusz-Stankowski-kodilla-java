package com.kodilla.good.patterns.flights;

public class FlightsApp {
    public static void main(String[] args) {
        FlightsSearcher flightsSearcher = new FlightsSearcher();
        System.out.println("Searching by departure airport: ");
        flightsSearcher.searchingByDepartureAirport("WARSZAWA");
        System.out.println(" ");
        System.out.println("Searching by arrival airport: ");
        flightsSearcher.searchingByArrivalAirport("WARSZAWA");
        System.out.println(" ");
        System.out.println("Searching connection: ");
        flightsSearcher.searchingByConnectionAirports("WARSZAWA", "RZESZOW");
    }
}
