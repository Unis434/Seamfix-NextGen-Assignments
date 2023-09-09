package Solutions.W5_Assignment_LibraryProjectManagement;

import java.util.List;

public interface ILibrary {
    void addBook(IBook book);
    List<IBook> getBooks();
}

