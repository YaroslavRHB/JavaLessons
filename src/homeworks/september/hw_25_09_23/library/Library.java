package homeworks.september.hw_25_09_23.library;

import java.time.LocalTime;
import java.util.Objects;

public class Library {
    private Book[] books;

    public Library(int size) {
        books = new Book[size];
    }

    public void addBook(User user, Book book) {
        if (user.isAdmin()) {
            for (int i = 0; i < books.length; i++) {
                if (Objects.isNull(books[i])) {
                    books[i] = book;
                    break;
                }
            }
        }
    }

    public boolean isOpen() {
        int hour = LocalTime.now().getHour();

        return hour >= 8 && hour <= 17;
    }

    public void deleteBook(User user, Book book) {
        if (user.isAdmin()) {
            for (int i = 0; i < books.length; i++) {
                if (Objects.nonNull(book) && book.getTitle().equals(books[i].getTitle())) {
                    books[i] = null;
                }
            }
        }
    }

    public void issueToClient(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isTaken()) {
                book.setTaken(true);
                user.addBook(book);
                break;
            }
        }
    }

    public void showAllBooks() {
        for (Book book : books) {
            if (Objects.nonNull(book)) {
                book.view();
            }
        }
    }
}

