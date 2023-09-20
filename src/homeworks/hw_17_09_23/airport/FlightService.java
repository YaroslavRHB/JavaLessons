package homeworks.hw_17_09_23.airport;

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

    public void seearchByCityArrival(Cities city) {
        for (Flight flight : flights) {
            if (Objects.nonNull(flight) && flight.getCityArrival() == city) {
                flight.view();
            }
        }
    }
}
