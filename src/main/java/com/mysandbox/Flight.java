package com.mysandbox;

import java.util.* ;


class Flight {
    private String flightNumber;
    private String destination;
    private String departureTime;

    public Flight(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return "* Flight" + System.lineSeparator()
                + " - flightNumber: " + flightNumber + System.lineSeparator()
                + " - destination: " + destination + System.lineSeparator()
                + " - departureTime: " + departureTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return flightNumber.equals(flight.flightNumber) && destination.equals(flight.destination) && departureTime.equals(flight.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, destination, departureTime);
    }
}

