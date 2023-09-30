package homeworks.september.hw_25_09_23.library;

import java.util.Objects;

public class User {
    private String firstName;
    private String lastName;
    private boolean isAdmin;
    private Book[] books;
    private String password;

    public User(int size, String password, String firstName, boolean isAdmin) {
        books = new Book[size];
        this.password = password;
        this.firstName = firstName;
        this.isAdmin = isAdmin;
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (Objects.isNull(books[i])) {
                books[i] = book;
                break;
            }
        }
    }

    public User(String firstName, String lastName, boolean isAdmin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAdmin = isAdmin;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
    public void showAllBooks() {
        for (Book book : books) {
            if (Objects.nonNull(book)) {
                book.view();
            }
        }
    }
}

