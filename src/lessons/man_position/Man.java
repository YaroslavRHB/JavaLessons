package lessons.man_position;

import java.util.Objects;

/**
 * Создать класс Man c полями имя, пол(использовать Enum) фамилия, возраст, должность.
 * Для должности создать отдельный класс с полем название должности.
 *
 * Создать несколько людей с одинаковой и разными должностями.
 * Создать методы позволяющие:
 *  - вывести данные о человеке.
 *  - проверять должности по названии на одинаковость у двух людей.
 *  - проверять однофамильцев.
 */
public class Man {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;
    private Position position;

    public Man(String firstName, String lastName, Gender gender, int age, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.position = position;
    }

    public String getLastName() {
        return lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void showInfo() {
        System.out.println("First name = " + firstName + "\tAge = " + age);
        position.showInfo();
    }


}
