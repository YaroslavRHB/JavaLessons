package homeworks.hw_03_08_23;

public class Calculator2 {
    private double first;
    private double second;

    public Calculator2(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public double add() {
        return first + second;
    }

    public double subtract() {
        return first - second;
    }

    public double multiply() {
        return first * second;
    }

    public double divide() {
        return first / second;
    }
}

class Calculator2Main {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2(34, 5);
        System.out.println(calc.add());
        calc.setFirst(3);
        calc.setSecond(5);
        System.out.println(calc.subtract());
        calc.setFirst(56);
        calc.setSecond(3);
        System.out.println(calc.multiply());
        calc.setFirst(43);
        calc.setSecond(38);
        System.out.println(calc.divide());


    }
}