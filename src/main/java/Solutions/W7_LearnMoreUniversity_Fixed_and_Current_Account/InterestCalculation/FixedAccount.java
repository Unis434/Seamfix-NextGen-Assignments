package Solutions.W7_LearnMoreUniversity_Fixed_and_Current_Account.InterestCalculation;

public class FixedAccount {
    double balance;

    public FixedAccount(double balance) {
        this.balance = balance;
    }

    public double calculateInterest() {
        // Calculate interest for fixed account (use fixed interest rate)
        double interestRate = 0.05; // Example fixed interest rate (you can adjust this)
        return balance * interestRate;
    }
}

