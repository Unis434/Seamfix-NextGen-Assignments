package Solutions.W6_Assignment_LPM_Input_Output;

public class Book implements IBook {
    // Existing fields and methods

    private String stock;

    public Book(String title, Author author, Genre genre, int publicationYear, String stock) {
        // Existing constructor initialization
        this.stock = stock;
    }

    public String getStock() {
        return stock;
    }


    /**
     * @return
     */
    @Override
    public String getTitle() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public Author getAuthor() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public Genre getGenre() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public int getPublicationYear() {
        return 0;
    }
}

