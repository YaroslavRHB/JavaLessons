package homeworks.hw_06_08_23;

public class Group {
    private String name;
    private int quantityOfStudents;
    public Group(String groupName, int quantityOfStudents) {
        this.name = groupName;
        this.quantityOfStudents = quantityOfStudents;
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        System.out.println("Group: " + name);
    }
}
