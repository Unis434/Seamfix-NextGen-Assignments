package Solutions.W6_Assignment_LPM_Input_Output;

import java.util.List;

public interface ILibrary {
    void addBook(IBook book);
    List<IBook> getBooks();
}

