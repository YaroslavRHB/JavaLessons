package homeworks.hw_03_08_23;

public class Student {
    private final String name;
    private int studiedYears;
    private int age;
    private int scholarship;

    public Student(String name) {
        this.name = name;
    }

    public void setStudiedYears(int studiedYears) {
        if (studiedYears > 0 && studiedYears < 6) {
            this.studiedYears = studiedYears;
        } else {
            System.out.println("Studied Years value must be in the range of 0-6");
        }
    }

    public void setAge(int age) {
        if (age >= 15 && age <= 25) {
            this.age = age;
        } else {
            System.out.println("Age value must be in the range of 15-25");
        }
    }

    public void setScholarship(int scholarship) {
        if (scholarship > 0) {
            this.scholarship = scholarship;
        } else {
            System.out.println("Scholarship value must be greater than 0");
        }
    }

    public String toString() {
        return "Student : " + name + "\nage : " + age + "\nstudied years : " + studiedYears +
                "\nscholarship : " + scholarship;
    }

}

class StudentMain {
    public static void main(String[] args) {
        Student jack = new Student("Jack");
        jack.setAge(35);
        jack.setScholarship(-1000);
        jack.setStudiedYears(67);
        System.out.println();
        System.out.println(jack);
        jack.setAge(20);
        jack.setScholarship(1000);
        jack.setStudiedYears(4);
        System.out.println();
        System.out.println(jack);
    }
}
