package homeworks.september.hw_30_09_23;

public class Woman extends Person {
    public Woman(String firstName, String lastName, int age, Sex sex) {
        super(firstName, lastName, age, sex);
    }

    private String maidenName;

    public boolean isRetired(Person person) {
        return person.getAge() >= 60;
    }

    public void registerPartnership(Man man, Woman woman) {
        woman.maidenName = woman.getLastName();
        woman.setLastName(man.getLastName()+"a");
        woman.setPartner(man);
    }

    public void deregisterPartnership(Woman woman) {
        woman.setLastName(woman.maidenName);
        woman.setPartner(null);
    }
}

