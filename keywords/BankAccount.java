
public class BankAccount {
    private static String bankName = "State bank of India";
    private static int totalAccounts = 0;

    private final long accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, long accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public static int getTotalAccounts() { return totalAccounts; }
    public static String getBankName() { return bankName; }

    public void deposit(double amount) { if (amount > 0) balance += amount; }
    public boolean withdraw(double amount) { if (amount > 0 && amount <= balance) { balance -= amount; return true; } return false; }

    public String detailsIfInstance(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount acc = (BankAccount) obj;
            return acc.accountHolderName + ", " + acc.accountNumber + ", " + acc.balance + ", " + bankName;
        }
        return "Not a BankAccount";
    }
}
