package Solutions.W6_Assignment_LPM_Input_Output;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Book> authoredBooks;

    public Author(String name) {
        this.name = name;
        this.authoredBooks = new ArrayList<>();
    }

    public void addAuthoredBook(Book book) {
        authoredBooks.add(book);
    }

    // Getters and setters
    public String getName() {
        return name;
    }
}
