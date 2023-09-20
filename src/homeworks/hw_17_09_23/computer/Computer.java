package homeworks.hw_17_09_23.computer;

public class Computer {
    private final Manufacturer manufacturer;
    private final int serialNumber;
    private float price;
    private final int coreNumber;
    private final int frequency;

    public Computer(Manufacturer manufacturer, int serialNumber, float price, int coreNumber, int frequency) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
        this.coreNumber = coreNumber;
        this.frequency = frequency;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void view() {
        System.out.println(
                "\nManufacturer: " + manufacturer + "\nSerial Number: " + serialNumber + "\nPrice: " + price +
                        "\nQuantity of cores: " + coreNumber + "\nCPU frequency: " + frequency);
    }
}
