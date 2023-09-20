package homeworks.hw_17_09_23.airport;

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
        System.out.println("Flight Number: " + flightNumber + "\n From: " + cityDeparture+ "\n To: "+ cityArrival+
                "\nFlight time is: "+ flightTime+ "\nAvailable seats: "+availableSeats );
    }

    public Cities getCityArrival() {
        return cityArrival;
    }
}
