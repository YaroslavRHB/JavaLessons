package homeworks.hw_17_09_23.motorcycle;

public class MotorcycleTest {
    public static void main(String[] args) {
        Motorcycle motorcycle1 = new Motorcycle("Suzuki GSX-R1000", 2021, 16000, 600,
                EngineType.DIESEL, Color.BLACK, false, 250000);
        Motorcycle motorcycle2 = new Motorcycle("YAMAHA FZ1", 2007, 9000, 700,
                EngineType.PETROL, Color.ORANGE, false, 250000);

        motorcycle1.view();
        motorcycle2.view();
        motorcycle1.toRepair();
        motorcycle2.toRepair();
        motorcycle1.view();
        motorcycle2.view();
        motorcycle1.toBreak();
        motorcycle1.view();
        motorcycle1.Colorize(Color.BLUE);
        motorcycle1.view();
        motorcycle1.toRepair();
        motorcycle1.view();
        motorcycle1.addMileage(10000);
        motorcycle1.view();
    }
}
