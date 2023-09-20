package lessons;

public class PassParams {
    public static void main(String[] args) {
        int a = 10;

        a = print2();

//        print1(a);

//        System.out.println(a);

        String v = "Hello";

        print3(v);//copy of reference

        System.out.println(v);

//        final char[] chars = {'H', 'e'};

//        chars = null;

        Man man = new Man();

        man.name = "John";

        print4(man);//copy of reference

        System.out.println(man.name);
    }

    public static void print1(int b) {
        b = 15;
    }

    public static void print3(String a) {
        a = "World";
    }

    public static void print4(Man man) {
        man.name = "World";
    }

    public static int print2() {
        return 15;
    }
}

class Man {
    public String name;
}
