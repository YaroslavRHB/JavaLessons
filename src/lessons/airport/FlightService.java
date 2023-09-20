package lessons.airport;

import java.util.Objects;

public class FlightService {
    private Flight[] flights;

    public FlightService(int size){
        flights = new Flight[size];
    }

    public void addFlight(Flight flight) {
        for (int i = 0; i < flights.length; i++) {
            if(Objects.isNull(flights[i])){
                flights[i]=flight;
                break;
            }
        }
    }

    public void searchFlightByCityArrival(City city){
        for (Flight flight : flights) {
            if(Objects.nonNull(flight) && flight.getCityArrival()==city){
                flight.view();
            }
        }
    }
}
