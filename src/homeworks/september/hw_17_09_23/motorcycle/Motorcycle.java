package homeworks.september.hw_17_09_23.motorcycle;

public class Motorcycle {
    private String name;
    private int yearOfProduction;
    private int price;
    private int weight;
    private EngineType engineType;
    private Color color;
    private boolean readyToDrive;
    private int mileage;

    public Motorcycle(String name, int yearOfProduction, int price, int weight, EngineType engineType, Color color,
                      boolean readyToDrive, int mileage) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.engineType = engineType;
        this.color = color;
        this.readyToDrive = readyToDrive;
        this.mileage = mileage;
    }

    public void setReadyToDrive(boolean readyToDrive) {
        this.readyToDrive = readyToDrive;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void toRepair() {
        setReadyToDrive(true);
    }

    public void toBreak() {
        if (getMileage() > 200000)
            setReadyToDrive(false);
    }

    public void Colorize(Color color) {
        setColor(color);
    }

    public void addMileage(int mileage) {
        setMileage(mileage + getMileage());
    }

    public void view() {
        System.out.println(
                "\nModel: " + name +
                        "\nYear: " + yearOfProduction +
                        "\nPrice: " + price +
                        "\nWeight: " + weight +
                        "\nColor: " + color +
                        "\nEngine: " + engineType +
                        "\nReady to Drive: " + readyToDrive +
                        "\nMileage: " + mileage);
    }
}
