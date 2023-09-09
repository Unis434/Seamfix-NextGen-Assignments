package Solutions.W3_Assignment;

public class Reservation {
    private final int ticketID;

    // Constructor to initialize the ticketID variable
    public Reservation(int ticketID) {
        this.ticketID = ticketID;
    }

    // Method to display the ticketID value
    public void showTicket() {
        System.out.println("Ticket ID: " + ticketID);
    }

    public static void main(String[] args) {
        // Creating an object of the org.example.Solutions.AssignmentW3.Reservation class
        Reservation reservation = new Reservation(350434);

        // Calling the showTicket() method to display the ticketID value
        reservation.showTicket();
    }
}
