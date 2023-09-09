package Solutions.W5_Assignment_LibraryProjectManagement;

public interface IUser {
    void borrowBook(IBook book);
    void returnBook(IBook book);
}
