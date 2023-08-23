package lessons;

public class Human {
    private int age;
    private float salary;

    public Human(int age, float newSalary) {
        this.age = age;
        salary = newSalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void print(int a) {
        if (a < 0) {
            System.out.println("a < 0");
        } else {
            System.out.println("a >= 0");
        }
    }

    public void print1(int a) {
        if (a < 0) {
            System.out.println("a < 0");
            return;
        }
        System.out.println("a >= 0");

    }
}

class TestHuman {
    public static void main(String[] args) {
        int a = 10;
//        datatype(class_name) reference_name = new datatype(params or absent);
        Human john = new Human(-23, 1200);

        john.setAge(25);

        int tempAge = -23;
/*
        if (tempAge < 0) {
            john.age = 0;
        }

        john.salary = 1200;*/

        Human jack = new Human(25, 1500);

        jack.setAge(26);

        /*jack.age = 25;
        jack.salary = 1500;*/

        int b = 10;

        b = b;

    }
}
