package Solutions.W7_LearnMoreUniversity_Fixed_and_Current_Account.InterestCalculation;

public class AccountTest {
    public static void main(String[] args) {
        FixedAccount fixedAccount = new FixedAccount(1000.0);
        SavingsAccount savingsAccount = new SavingsAccount(1000.0);

        // Calculate interest for both accounts
        double fixedInterest = fixedAccount.calculateInterest();
        double savingsInterest = savingsAccount.calculateInterest();

        System.out.println("Fixed Account Interest: $" + fixedInterest);
        System.out.println("Savings Account Interest: $" + savingsInterest);
    }
}
