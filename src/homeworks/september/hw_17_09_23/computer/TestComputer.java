package homeworks.september.hw_17_09_23.computer;

import java.util.Objects;

/**
 * 1) Write Computer class, the attributes of this class is manufacturer (of enum type), serialNumber (of int type),
 * price (of float type), quantityCPU (of int type) and frequencyCPU (of int type).
 * <p>
 * 2) The fields Computer class need to be encapsulated. Use correct access modifiers.
 * <p>
 * 3) Write a program to create array of Computer objects (5 pcs.). Declare array of Computer objects (5 pcs.),
 * create 5 Computer objects and place it to array.
 * <p>
 * 4) Write a program that iterate through array of Computer objects and increases by 10 percent field price.
 * <p>
 * 5) Add to class Computer method void view(){} that prints all fields of object in line.
 * Print all info (fields) of all objects in console.
 */

public class TestComputer {

    public static void main(String[] args) {

        Computer[] computers = new Computer[5];

        Computer c1 = new Computer(Manufacturer.APPLE, 3468572, 3245.5f, 8, 2700);
        Computer c2 = new Computer(Manufacturer.SAMSUNG, 4538572, 2100.0f, 6, 2500);
        Computer c3 = new Computer(Manufacturer.LENOVO, 75668572, 1545.5f, 8, 2200);
        Computer c4 = new Computer(Manufacturer.SAMSUNG, 1147572, 2540.5f, 8, 2500);
        Computer c5 = new Computer(Manufacturer.APPLE, 24683545, 3800.5f, 12, 3000);

        computers[0] = c1;
        computers[1] = c2;
        computers[2] = c3;

        for (Computer computer : computers) {

            if (Objects.nonNull(computer)) {

                float price = computer.getPrice();
                price += price * .1;
                computer.setPrice(price);
                computer.view();
            }
        }
    }
}
