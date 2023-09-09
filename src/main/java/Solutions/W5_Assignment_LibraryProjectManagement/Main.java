package Solutions.W5_Assignment_LibraryProjectManagement;

public class Main {
    public static void main(String[] args) {
        // Create authors
        Author author1 = new Author("Daniel Kpobari");
        Author author2 = new Author("Unisa Kamara");

        // Create books
        Book book1 = new Book("Salt Lake City", author1, Genre.FICTION, 2020);
        Book book2 = new Book("Cashflow Management Guide", author2, Genre.NON_FICTION, 2018);
        Book book3 = new Book("Mystery Thriller", author1, Genre.MYSTERY, 2019);
        Book book4 = new Book("Science Fiction Adventure", author2, Genre.SCIENCE_FICTION, 2021);

        // Create the library
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Create users
        User user1 = new User("Chucks");
        User user2 = new User("Grace");

        // User 1 borrows books
        user1.borrowBook(book1);
        user1.borrowBook(book2);

        // User 2 borrows books
        user2.borrowBook(book3);
        user2.borrowBook(book4);

        // Create library cards
        LibraryCard card1 = new LibraryCard(user1);
        card1.borrowBook(book3, "2023-09-15");

        LibraryCard card2 = new LibraryCard(user2);
        card2.borrowBook(book1, "2023-08-30");
        card2.borrowBook(book2, "2023-08-25");

        // Display all books in the library
        System.out.println("Books in the Library:");
        for (IBook book : library.getBooks()) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor().getName());
            System.out.println("Genre: " + book.getGenre());
            System.out.println("Publication Year: " + book.getPublicationYear());
            System.out.println();
        }

        // Check if books are overdue
        System.out.println("Checking Overdue Books:");
        checkOverdueStatus(card1, "2023-09-10");
        checkOverdueStatus(card2, "2023-08-28");

        // Return books
        user1.returnBook(book1);
        user2.returnBook(book3);

        // Display updated borrowed books
        System.out.println("Chuks's Borrowed Books:");
        displayBorrowedBooks(user1);

        System.out.println("Grace's Borrowed Books:");
        displayBorrowedBooks(user2);
    }

    // Function to check if a book is overdue
    private static void checkOverdueStatus(LibraryCard card, String currentDate) {
        for (IBook book : card.getBorrowedBooks()) {
            if (card.isBookOverdue((Book) book, currentDate)) {
                System.out.println(book.getTitle() + " is overdue.");
            } else {
                System.out.println(book.getTitle() + " is not overdue.");
            }
        }
    }

    // Function to display a user's borrowed books
    private static void displayBorrowedBooks(User user) {
        for (Book book : user.getBorrowedBooks()) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor().getName());
            System.out.println("Genre: " + book.getGenre());
            System.out.println("Publication Year: " + book.getPublicationYear());
            System.out.println();
        }
    }
}
