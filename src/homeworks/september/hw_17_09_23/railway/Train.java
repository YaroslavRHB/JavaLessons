package homeworks.september.hw_17_09_23.railway;

public class Train {
    private int number;
    private int quantityOfCarriages;
    private Coach coach;
    private Cities departure;
    private Cities arrival;
    private int travelTime;
    private TrainType trainType;

    public Train(int number, int quantityOfCarriages, Coach coach, Cities departure, Cities arrival,
                 int travelTime, TrainType trainType) {
        this.number = number;
        this.quantityOfCarriages = quantityOfCarriages;
        this.coach = coach;
        this.departure = departure;
        this.arrival = arrival;
        this.travelTime = travelTime;
        this.trainType = trainType;
    }

    public int getNumber() {
        return number;
    }

    public Coach getCoach() {
        return coach;
    }

    public Cities getDeparture() {
        return departure;
    }

    public Cities getArrival() {
        return arrival;
    }

    public void view() {
        //?????????????????????????
        System.out.println(
                "\nTrain number: " + getNumber() +
                        "\nQuantity of carriages: " + quantityOfCarriages +
                        "\nClass: " + coach +
                        "\nDeparture: " + departure +
                        "\nArrival: " + arrival +
                        "\nTravel time: " + travelTime +
                        "\nTrain type: " + trainType);
    }
}
