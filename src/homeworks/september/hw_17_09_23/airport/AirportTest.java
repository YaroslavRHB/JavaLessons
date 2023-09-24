package homeworks.september.hw_17_09_23.airport;

/**
 * Создать приложение, позволяющие создавать расписание аэропорта.
 * Приложение должно позволять:
 * 1) Создавать рейс.
 * 2) После ввода страны прибытия и/или страны отправления выводить список подходящих рейсов.
 * 3) Просматривать все рейсы.
 * 4) Просматривать информацию о конкретном рейсе по номеру.
 * 5) Организовать "умный поиск". Пользователь вводит требования(город отправления, город прибытия, время в полете,
 * количество мест) и выводить рейс, который соответствует требованиям.
 * Для полей "город отправления", "город прибытия" использовать enums.
 */

public class AirportTest {
    public static void main(String[] args) {
        Flight f1 = new Flight(Cities.NEW_YORK, Cities.DUBLIN, 3467, 680, 23);
        Flight f2 = new Flight(Cities.KYIV, Cities.PARIS, 765, 270, 2);
        Flight f3 = new Flight(Cities.PARIS, Cities.NEW_YORK, 2290, 750, 61);
        Flight f4 = new Flight(Cities.SYDNEY, Cities.KYIV, 345, 1210, 43);

        FlightService flightService = new FlightService(5);
        flightService.addFlight(f1);
        flightService.addFlight(f2);
        flightService.addFlight(f3);
        flightService.addFlight(f4);

        flightService.searchByCityArrival(Cities.PARIS);
        flightService.searchByCityDeparture(Cities.NEW_YORK);
        flightService.showAllFlight();
        flightService.showFlightByNumber(345);
        flightService.smartSearch(Cities.NEW_YORK, Cities.DUBLIN, 3467, 680, 23);
    }
}
