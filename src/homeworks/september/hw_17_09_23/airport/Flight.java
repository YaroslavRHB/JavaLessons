package homeworks.september.hw_17_09_23.airport;

public class Flight {
    private Cities cityArrival;
    private Cities cityDeparture;
    private int flightNumber;
    private int flightTime;
    private int availableSeats;

    public Flight(Cities cityArrival, Cities cityDeparture, int flightNumber, int flightTime, int availableSeats) {
        this.cityArrival = cityArrival;
        this.cityDeparture = cityDeparture;
        this.flightNumber = flightNumber;
        this.flightTime = flightTime;
        this.availableSeats = availableSeats;
    }
    public void view (){
        System.out.println("Flight Number: " + flightNumber + "\nFrom: " + cityDeparture+ "\nTo: "+ cityArrival+
                "\nFlight time is: "+ flightTime+ "\nAvailable seats: "+availableSeats );
        System.out.println();
    }

    public Cities getCityArrival() {
        return cityArrival;
    }
    public Cities getCityDeparture() {
        return cityDeparture;
    }
    public int getFlightNumber() {
        return flightNumber;
    }
    public int getFlightTime() {
        return flightTime;
    }
    public int getAvailableSeats() {
        return availableSeats;
    }
}
