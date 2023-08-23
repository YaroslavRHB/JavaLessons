package lessons;

public class LearnStatic {
    public static void main(String[] args) {
        //array
//        GameSoldier.countAlive = -15;
    }
}

class GameSoldier {
    private int age;
    private String name;

    private static int countAlive;

    public void setName(String name) {
        setCountAlive(15);
        this.name = name;
    }

    public static void setCountAlive(int countAlive) {
//        setName();
        GameSoldier.countAlive = countAlive;
    }
}
