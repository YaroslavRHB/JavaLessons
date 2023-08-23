package lessons;

public class PassParams {
    public static void main(String[] args) {
        int a = 10;

        a = print2();

//        print1(a);

//        System.out.println(a);

        String v = "Hello";

        print3(v);

        System.out.println(v);

//        final char[] chars = {'H', 'e'};

//        chars = null;
    }

    public static void print1(int b) {
        b = 15;
    }

    public static void print3(String a) {
        a = "World";
    }

    public static void print4(String a) {
        a = "World";
    }

    public static int print2() {
        return 15;
    }
}

class Man {
    public String name;
}
