package homeworks.september.hw_25_09_23.library;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String view() {
        return "\nFirst Name: " + firstName +
                "\nLast Name: " + lastName;
    }
}
