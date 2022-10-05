package JavaAdvanced.DefiningClasses.Lab.BankAccount;

public class BankAccount {
    private final static double DEFAULT_INTEREST_RATE = 0.02;
    private static double interesetRate = DEFAULT_INTEREST_RATE;
    private static int bankAccountCount = 1;
    private int id;
    private double balance;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    BankAccount() {
        this.id = bankAccountCount++;
    }

    static void setInterestRate(double interestRate) {
        BankAccount.interesetRate = interestRate;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    double getInterest(int years) {
        return BankAccount.interesetRate * years * this.balance;
    }
}
