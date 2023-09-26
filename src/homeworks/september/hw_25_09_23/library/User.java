package homeworks.september.hw_25_09_23.library;

public class User {
    private String firstName;
    private String lastName;
    private boolean isAdmin;

    public User(String firstName, String lastName, boolean isAdmin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAdmin = isAdmin;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
