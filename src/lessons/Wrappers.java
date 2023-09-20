package lessons;

public class Wrappers {
    public static void main(String[] args) {
        Integer i1 = 5;
        Integer i2 = 5;
        Integer i3 = new Integer(5);

        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
    }
}
