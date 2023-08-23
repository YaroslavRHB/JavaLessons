package homeworks.hw_06_08_23;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private Group group;
    private University university;

    public Student(String firstName, String lastName, int age, String gender, Group group, University university) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.group = group;
        this.university = university;
    }

    public void showInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        group.showInfo();
        university.showInfo();
        System.out.println();
    }

    public String getLastName() {
        return lastName;
    }

    public Group getGroup() {
        return group;
    }

    public University getUniversity() {
        return university;
    }
}

