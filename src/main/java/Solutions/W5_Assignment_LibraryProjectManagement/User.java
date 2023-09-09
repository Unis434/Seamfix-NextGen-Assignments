package Solutions.W5_Assignment_LibraryProjectManagement;

import java.util.ArrayList;
import java.util.List;

public class User implements IUser {
    private String username;
    private List<Book> borrowedBooks;

    public User(String username) {
        this.username = username;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public void borrowBook(IBook book) {
        borrowedBooks.add((Book) book);
    }

    @Override
    public void returnBook(IBook book) {
        borrowedBooks.remove((Book) book);


    }

    public Book[] getBorrowedBooks() {
        return new Book[0];
    }
}
