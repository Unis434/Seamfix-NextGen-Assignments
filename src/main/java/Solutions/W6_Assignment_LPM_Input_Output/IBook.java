package Solutions.W6_Assignment_LPM_Input_Output;

public interface IBook {
    String getTitle();
    Author getAuthor();
    Genre getGenre();
    int getPublicationYear();

    String getStock();
}
