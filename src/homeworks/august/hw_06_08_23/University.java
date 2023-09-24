package homeworks.august.hw_06_08_23;

public class University {
    private String name;
    private int quantityOfGroups;
    private int estDate;

    public University(String name, int quantityOfGroups, int estDate) {
        this.name = name;
        this.quantityOfGroups = quantityOfGroups;
        this.estDate = estDate;
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        System.out.println("University : " + name);
    }
}
