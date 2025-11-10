class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String acc, double bal, double rate) {
        super(acc, bal);
        this.interestRate = rate;
    }

    public void displayAccountType() {
        System.out.println("Savings Account | Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String acc, double bal, double limit) {
        super(acc, bal);
        this.withdrawalLimit = limit;
    }

    public void displayAccountType() {
        System.out.println("Checking Account | Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int tenure;

    public FixedDepositAccount(String acc, double bal, int tenure) {
        super(acc, bal);
        this.tenure = tenure;
    }

    public void displayAccountType() {
        System.out.println("Fixed Deposit Account | Tenure: " + tenure + " years");
    }

    public static void main(String[] args) {
        new SavingsAccount("SA001", 50000, 5).displayAccountType();
        new CheckingAccount("CA002", 20000, 10000).displayAccountType();
        new FixedDepositAccount("FD003", 100000, 5).displayAccountType();
    }
}
