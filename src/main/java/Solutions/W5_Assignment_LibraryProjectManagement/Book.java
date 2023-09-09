package Solutions.W5_Assignment_LibraryProjectManagement;

public class Book implements IBook {
    private String title;
    private Author author;
    private Genre genre;
    private int publicationYear;

    public Book(String title, Author author, Genre genre, int publicationYear) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}

