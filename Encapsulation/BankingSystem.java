abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }
    public abstract double calculateInterest();

    public double getBalance() { return balance; }
}

interface Loanable {
    void applyForLoan();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int acc, String name, double bal) { super(acc, name, bal); }
    public double calculateInterest() { return getBalance() * 0.04; }
    public void applyForLoan() { System.out.println("Loan applied for Savings Account"); }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc = new SavingsAccount(1001, "Eazy", 50000);
        acc.deposit(2000);
        System.out.println("Interest: " + acc.calculateInterest());
    }
}
