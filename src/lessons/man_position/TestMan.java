package lessons.man_position;

public class TestMan {
    public static void main(String[] args) {
        Position it = new Position("IT");
        Position manager = new Position("Manager");

        Man john = new Man("John", "Travolta", Gender.MALE, 32, it);
        Man ben = new Man("Ben", "Travolta", Gender.MALE, 26, manager);

        boolean isEqualPositions = ManService.comparePositions(john, ben);

        System.out.println(isEqualPositions);

        boolean isEqualLastNames = ManService.compareLastNames(john, ben);

        System.out.println(isEqualLastNames);
    }
}
