package Solutions.W6_Assignment_LPM_Input_Output;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Map<Genre, List<Book>> categorizeBooks() {
        Map<Genre, List<Book>> categorizedBooks = new HashMap<>();

        for (Book book : books) {
            categorizedBooks.computeIfAbsent(book.getGenre(), k -> new ArrayList<>()).add(book);
        }

        return categorizedBooks;
    }

    public List<IBook> getBooks() {
        return new ArrayList<>(books);
    }

    public List<Book> searchByTitle(String sample) {
            return null;
    }

    public Book findBookByTitle(String title) {
        return null;
    }
}
