package homeworks.september.hw_25_09_23.library;

import java.util.Objects;

public class Library {
    private Book [] booksInStock;
    private Book [] handIssuedBooks;

    public Library(int size, User user) {
        Book [] booksInStock = new Book[size];
    }
    public Library(Book book){
        for (int i = 0; i < handIssuedBooks.length; i++) {
        if (Objects.nonNull(book) && handIssuedBooks[i]==null){
            handIssuedBooks[i] = book;
            break;
        }
    }
}
