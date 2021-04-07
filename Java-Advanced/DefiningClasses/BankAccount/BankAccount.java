package BankAccount;

public class BankAccount {
    private static int idCount = 1;
    private static double interestRate = 0.02;

    private int id;
    private double balance;

    public BankAccount() {
        this.id = idCount;
        idCount++;
    }

    public int getId() {
        return this.id;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterest(int years) {
        return this.balance * years * interestRate;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}
