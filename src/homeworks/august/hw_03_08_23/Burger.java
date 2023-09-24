package homeworks.august.hw_03_08_23;

public class Burger {
    private String bun;
    private String meat;
    private String meat2;
    private String cheese;
    private String greens;
    private String mayo;



    public Burger(String bun, String meat, String cheese, String greens, String mayo) {
        this(bun, meat, cheese, greens);
        this.mayo = mayo;
        System.out.println("Regular burger ingredients: \nBun- " + bun + "\nMeat- " + meat + "\nCheese- " +
                cheese + "\nGreens- " + greens + "\nMayo- " + mayo);
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Diet burger ingredients: \nBun- " + bun + "\nMeat- " + meat + "\nCheese- " +
                cheese + "\nGreens- " + greens);
    }

    public Burger(String bun, String meat, String meat2, String cheese, String greens, String mayo) {
        this(bun, meat, cheese, greens, mayo);
        this.meat2 = meat2;
        System.out.println("Twins burger ingredients: \nBun- " + bun + "\nMeat- " + meat + "\nMeat2- " +
                meat2 + "\nCheese- " + cheese + "\nGreens- " + greens + "\nMayo- " + mayo);
    }
}

class BurgerMain {
    public static void main(String[] args) {
        Burger regular = new Burger("Black ", "Pork", "Cheddar", "Lettuce", "mayo");
        System.out.println();
        Burger diet = new Burger("White ", "Beef", "Gouda", "Iceberg");
        System.out.println();
        Burger twins = new Burger("White ", "Pork", "Beef", "Cheddar", "Lettuce",
                "mayo");

    }
}

