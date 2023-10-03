package homeworks.september.hw_30_09_23;

public class Man extends Person {
    public Man(String firstName, String lastName, int age, Sex sex) {
        super(firstName, lastName, age, sex);
    }

    public boolean isRetired(Person person) {
        return person.getAge() >= 65;
    }

    public void registerPartnership(Man man, Woman woman) {
        man.setPartner(woman);
    }

    public void deregisterPartnership(Man man) {
        man.setPartner(null);
    }

}
