package homeworks.september.hw_30_09_23;

public class PersonTest {
    public static void main(String[] args) {

        Man man = new Man("Dmitry", "Ivanov", 35, Sex.MALE);
        Woman woman = new Woman("Katerina", "Petrova", 87, Sex.FEMALE);

        man.showInfo();
        woman.showInfo();

        System.out.println();
        System.out.println(man.isRetired(man));
        System.out.println(woman.isRetired(woman));

        woman.registerPartnership(man,woman);
        woman.showInfo();

        woman.deregisterPartnership(woman);
        woman.showInfo();
    }
}
