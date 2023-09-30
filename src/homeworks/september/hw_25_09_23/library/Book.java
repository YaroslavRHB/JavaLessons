package homeworks.september.hw_25_09_23.library;

public class Book {

    private String title;
    private Author author;
    private Genre genre;
    private boolean isTaken;

    public Book(Author author, String bookTitle, Genre genre) {
        this.title = bookTitle;
        this.author = author;
        this.genre = genre;
    }

    public void setTaken(boolean taken) {
        isTaken = taken;
    }

    public boolean isTaken() {
        return isTaken;
    }

    public String getTitle() {
        return title;
    }

    public void view() {
        System.out.println("\nAuthor: " + author.view() +
                "\nTitle: " + title +
                "\nGenre: " + genre);
    }
}
