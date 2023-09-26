package homeworks.september.hw_17_09_23.airport;

import java.util.Objects;

public class FlightService {
    private Flight[] flights;

    public FlightService(int size) {
        flights = new Flight[size];
    }

    public void addFlight(Flight flight) {
        for (int i = 0; i < flights.length; i++) {
            if (Objects.nonNull(flights[i])) {
                flights[i] = flight;
                break;
            }
        }
    }

    public void searchByCityArrival(Cities city) {
        for (Flight flight : flights) {
            if (Objects.nonNull(flight) && flight.getCityArrival() == city) {
                flight.view();
                System.out.println();
            }
        }
    }

    public void searchByCityDeparture(Cities city) {
        for (Flight flight : flights) {
            if (Objects.nonNull(flight) && flight.getCityDeparture() == city) {
                flight.view();
                System.out.println();
            }
        }
    }

    public void showAllFlight() {
        for (Flight flight : flights) {
            if (Objects.nonNull(flight)) {
                flight.view();
            }
        }
    }

    public void showFlightByNumber(int number) {
        for (Flight flight : flights) {
            if (Objects.nonNull(flight) && flight.getFlightNumber() == number) {
                flight.view();
                System.out.println();
            }
        }
    }

    public void smartSearch(Cities cityArrival, Cities cityDeparture, int flightNumber, int flightTime, int seats) {
        for (Flight flight : flights) {
            if (Objects.nonNull(flight) && flight.getCityArrival() == cityArrival
                    && flight.getCityDeparture() == cityDeparture && flight.getFlightNumber() == flightNumber
                    && flight.getFlightTime() == flightTime && flight.getAvailableSeats() == seats) {
                flight.view();
                System.out.println();
            }
        }
    }
}
