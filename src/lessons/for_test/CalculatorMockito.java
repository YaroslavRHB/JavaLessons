package lessons.for_test;

import java.util.Random;

public class CalculatorMockito {
    public int sum(int a) {
//        this.print();
        return a + this.getRandom();
    }

    public int getRandom() {
        return new Random().nextInt(50);
    }

    public void print() {
        System.out.println("Hello");
    }
}
