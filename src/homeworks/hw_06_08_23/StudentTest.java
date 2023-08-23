package homeworks.hw_06_08_23;

public class StudentTest {
    public static void main(String[] args) {

        University harvard = new University("Harvard", 600, 1636);
        University yale = new University("Yale", 450, 1701);

        Group law = new Group("Lawyers", 50);
        Group economics = new Group("Economics", 90);

        Student john = new Student("John", "Smith", 21, "male", law, harvard);
        Student bill = new Student("Bill", "Gates", 24, "male", economics, yale);
        Student bob = new Student("Bob", "Torn", 24, "male", economics, yale);

        john.showInfo();
        bill.showInfo();
        bob.showInfo();

        boolean isEqualGroups = StudentService.groupCompare(bob, bill);
        boolean isEqualUniversities = StudentService.universityCompare(john, bill);
        boolean isEqualLastNames = StudentService.lastNameCompare(bill, john);

        System.out.println(isEqualGroups);
        System.out.println(isEqualUniversities);
        System.out.println(isEqualLastNames);
    }

}
