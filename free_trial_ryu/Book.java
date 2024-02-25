package free_trial_ryu;

import java.time.LocalDate;
import java.util.List;

public class Book {
    // フィールド
    private String isbn;
    private String title;
    private List<Author> authors;
    private String publisher;
    private LocalDate published;
    public Book(String isbn, String title, List<Author> authors, String publisher, LocalDate published) {
        this.isbn = isbn;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.published = published;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<Author> getAuthors() {
        return authors;
    }
    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public LocalDate getPublished() {
        return published;
    }
    public void setPublished(LocalDate published) {
        this.published = published;
    }
    
}
