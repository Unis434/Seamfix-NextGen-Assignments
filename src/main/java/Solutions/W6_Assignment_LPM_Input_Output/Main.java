package Solutions.W6_Assignment_LPM_Input_Output;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create authors
        Author author1 = new Author("Chetan Bhagat");
        Author author2 = new Author("Balwant Gargi");
        Author author3 = new Author("V.S. Naipaul");
        // Add more authors as needed

        // Create the library
        Library library = new Library();

        // Read book data from CSV and add books to the library
        readBooksFromCSV(library, author1, author2, author3);

        // Create users
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // User 1 borrows books
        user1.borrowBook(library.findBookByTitle("One Indian Girl"));
        user1.borrowBook(library.findBookByTitle("Half Girlfriend"));

        // User 2 borrows books
        user2.borrowBook(library.findBookByTitle("Naked Triangle"));
        user2.borrowBook(library.findBookByTitle("A Bend in the River"));

        // Create library cards
        LibraryCard card1 = new LibraryCard(user1);
        card1.borrowBook(library.findBookByTitle("A River Sutra"), "2023-09-15");

        LibraryCard card2 = new LibraryCard(user2);
        card2.borrowBook(library.findBookByTitle("Making India Awesome"), "2023-08-30");
        card2.borrowBook(library.findBookByTitle("One Indian Girl"), "2023-08-25");

        // Display all books in the library
        System.out.println("Books in the Library:");
        for (IBook book : library.getBooks()) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor().getName());
            System.out.println("Genre: " + book.getGenre());
            System.out.println("Publication Year: " + book.getPublicationYear());
            System.out.println("Stock: " + book.getStock());
            System.out.println();
        }

        // Categorize and display books
        Map<Genre, List<Book>> categorizedBooks = library.categorizeBooks();
        for (Map.Entry<Genre, List<Book>> entry : categorizedBooks.entrySet()) {
            System.out.println("Genre: " + entry.getKey());
            for (Book book : entry.getValue()) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor().getName());
                System.out.println("Stock: " + book.getStock());
                System.out.println();
            }
        }

        // Check if books are overdue and display borrowed books
        System.out.println("Checking Overdue Books:");
        checkOverdueStatus(card1, "2023-09-10");
        checkOverdueStatus(card2, "2023-08-28");

        System.out.println("Unisa's Borrowed Books:");
        displayBorrowedBooks(user1);

        System.out.println("Chuck's Borrowed Books:");
        displayBorrowedBooks(user2);
    }

    private static void readBooksFromCSV(Library library, Author... authors) {
        try (BufferedReader reader = new BufferedReader(new FileReader("library_books.csv"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length >= 3) {
                    String title = parts[1];
                    String authorName = parts[0];
                    Author author = findOrCreateAuthor(authors, authorName);
                    String stock = parts[2];

                    Book book = new Book(title, author, Genre.UNKNOWN, 0, stock);
                    library.addBook(book);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Author findOrCreateAuthor(Author[] authors, String authorName) {
        for (Author author : authors) {
            if (author.getName().equals(authorName)) {
                return author;
            }
        }
        return new Author(authorName);
    }

    private static void checkOverdueStatus(LibraryCard card, String currentDate) {
        for (IBook book : card.getBorrowedBooks()) {
            if (card.isBookOverdue((Book) book, currentDate)) {
                System.out.println(book.getTitle() + " is overdue.");
            } else {
                System.out.println(book.getTitle() + " is not overdue.");
            }
        }
    }

    private static void displayBorrowedBooks(User user) {
        System.out.println(user.getUsername() + "'s Borrowed Books:");
        for (Book book : user.getBorrowedBooks()) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor().getName());
            System.out.println("Stock: " + book.getStock());
            System.out.println();
        }
    }
}
