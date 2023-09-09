package Solutions.W7_LearnMoreUniversity_Fixed_and_Current_Account.InterestCalculation;

public class SavingsAccount extends FixedAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        // Calculate interest for savings account (use savings interest rate)
        double interestRate = 0.03; // Example savings interest rate (you can adjust this)
        return balance * interestRate;
    }
}

