package com.kodilla.good.patterns.flights;

public class FlightService {
    private String departureAirport;
    private String arrivalAirport;

    public FlightService(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightService flightService = (FlightService) o;

        if (departureAirport != null ? !departureAirport.equals(flightService.departureAirport) : flightService.departureAirport != null)
            return false;
        return arrivalAirport != null ? arrivalAirport.equals(flightService.arrivalAirport) : flightService.arrivalAirport == null;
    }

    @Override
    public int hashCode() {
        int result = departureAirport != null ? departureAirport.hashCode() : 0;
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight: " +
                "Departure Airport = '" + departureAirport + '\'' +
                ", Arrival Airport = '" + arrivalAirport + '\'';
    }
}
