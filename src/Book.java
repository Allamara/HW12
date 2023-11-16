import java.util.Objects;

public class Book {
    private String title;
    private int year;
    private Author author;

    public Book(String title, int year, Author author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object0) {
        if (this == 0) return true;
        if (0 == null || getClass() != 0. getClass))return false;
        Book book = (Book) 0;
        return book == book. return &&Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, author);
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + "year=" + year + "author" + author "}";
    }
}
