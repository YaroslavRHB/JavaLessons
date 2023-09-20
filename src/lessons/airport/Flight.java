package lessons.airport;

/**
 * Создать приложение, позволяющие создавать расписание аэропорта.
 * Приложение должно позволять:
 * 1) Создавать рейс.
 * 2) После ввода страны прибытия и/или страны отправления выводить список подходящих рейсов.
 * 3) Просматривать все рейсы.
 * 4) Просматривать информацию о конкретном рейсе по номеру.
 * 5) Организовать "умный поиск". Пользователь вводит требования(город отправления, город прибытия, время в полете,
 * количество мест)
 * и выводить рейс, который соответствует требованиям.
 * Для полей "город отправления", "город прибытия" использовать enums.
 */
public class Flight {
    private City cityArrival;
    private City cityDeparture;
    private int number;
    private int flightTime;
    private int countSeats;

    public Flight(City cityArrival, City cityDeparture, int number, int flightTime, int countSeats) {
        this.cityArrival = cityArrival;
        this.cityDeparture = cityDeparture;
        this.number = number;
        this.flightTime = flightTime;
        this.countSeats = countSeats;
    }

    public City getCityArrival() {
        return cityArrival;
    }

    public City getCityDeparture() {
        return cityDeparture;
    }

    public int getNumber() {
        return number;
    }

    public int getFlightTime() {
        return flightTime;
    }

    public int getCountSeats() {
        return countSeats;
    }

    public void view() {
        System.out.println(
                "\n City arrival is : " + cityArrival +
                "\n City departure is : " + cityDeparture +
                "\n Flight`s number is : " + number +
                "\n Flight`s time is : " + flightTime +
                        "\n Quantity of seats is :" + countSeats);
    }
}
