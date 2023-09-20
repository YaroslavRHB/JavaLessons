package lessons.airport;

public class TestFlight {
    public static void main(String[] args) {
        Flight f1 = new Flight(City.KIEV,City.LVIV, 4356, 50, 45);
        Flight f2 = new Flight(City.LVIV,City.DUBLIN, 4543, 450, 14);
        Flight f3 = new Flight(City.DUBLIN,City.LVIV, 3562, 450, 5);
        Flight f4 = new Flight(City.KIEV,City.ODESSA, 1346, 60, 32);

        FlightService fs = new FlightService(5);
        fs.addFlight(f1);
        fs.addFlight(f2);
        fs.addFlight(f3);
        fs.addFlight(f4);

        fs.searchFlightByCityArrival(City.KIEV);



    }
}
