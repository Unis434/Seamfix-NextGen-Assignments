package Solutions.W6_Assignment_LPM_Input_Output;

import java.util.HashMap;
import java.util.Map;

public class LibraryCard {
    private User user;
    private Map<Book, String> borrowedBooks; // Book to Due Date mapping

    public LibraryCard(User user) {
        this.user = user;
        this.borrowedBooks = new HashMap<>();
    }

    public void borrowBook(Book book, String dueDate) {
        borrowedBooks.put(book, dueDate);
    }

    public boolean isBookOverdue(Book book, String currentDate) {
        if (borrowedBooks.containsKey(book)) {
            String dueDate = borrowedBooks.get(book);
            // Implement date comparison logic here to check if it's overdue
            // Compare currentDate and dueDate
            // Return true if overdue, false otherwise
        }
        return false; // Modify this based on your date comparison logic
    }

    public IBook[] getBorrowedBooks() {
        return new IBook[0];
    }
}

