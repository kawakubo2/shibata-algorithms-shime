package free_trial_ryu;

import java.time.LocalDate;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        List<Author> authors = List.of(new Author("山田太郎", "taro"), new Author("横山花子", "hanako"));
        var book = new Book("978-4-1111-2222-3", "Javaは楽しいか", authors, "翔泳社", LocalDate.of(2022, 8, 5));
        System.out.println(book.getTitle());
    }
}
