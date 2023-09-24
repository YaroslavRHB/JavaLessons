package homeworks.august.hw_03_08_23;

public class Computer {
    private final int serialNumber;
    private float price;
    private final int quantityCPU;
    private final int frequencyCPU;

    public Computer(int serialNumber, float price, int quantityCPU, int frequencyCPU) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.quantityCPU = quantityCPU;
        this.frequencyCPU = frequencyCPU;
    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    public void view() {
        System.out.println("SN: " + serialNumber + "| Price: " + price + "| qCPU: " + quantityCPU + "| fCPU: " +
                frequencyCPU);
    }
}

class ComputerMain {
    public static void main(String[] args) {
        Computer comp1 = new Computer(34687984, 500, 4, 2500);
        Computer comp2 = new Computer(38569463, 600, 4, 3000);
        Computer comp3 = new Computer(53457884, 800, 6, 2500);
        Computer comp4 = new Computer(95876293, 1000, 8, 2500);
        Computer comp5 = new Computer(67934562, 1500, 12, 2500);

        Computer[] computers = new Computer[]{comp1, comp2, comp3, comp4, comp5};

        System.out.println();
        for (Computer comp : computers) {
            comp.setPrice(comp.getPrice() * 1.1f);
            comp.view();
        }
        System.out.println();
    }
}
