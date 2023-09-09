package Solutions.W5_Assignment_LibraryProjectManagement;

import java.util.ArrayList;
import java.util.List;

public class Library implements ILibrary {
    private List<IBook> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void addBook(IBook book) {
        books.add(book);

    }

    public List<IBook> getBooks() {
        return new ArrayList<>(books);
    }

    public List<Book> searchByTitle(String sample) {
            return null;
    }
}
