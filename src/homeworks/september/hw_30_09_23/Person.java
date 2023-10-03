package homeworks.september.hw_30_09_23;

import java.util.Objects;

public class Person {
    private final String firstName;
    private String lastName;
    private final int age;
    private final Sex sex;
    private Person partner;

    public Person(String firstName, String lastName, int age, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    public void showInfo() {
        System.out.println("\nFirst name: " + firstName + "\nLast name: " + lastName +
                "\nAge: " + age + "\nSex: " + sex);
        if (Objects.nonNull(partner)) {
            System.out.println("Partner: " + partner.firstName + " " + partner.lastName);
        }
    }
}
