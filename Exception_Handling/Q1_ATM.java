public class Q1_ATM {
    static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String msg){ super(msg); }
    }

    static class ATM {
        private int balance;
        public ATM(int balance){ this.balance = balance; }
        public void withdraw(int amount) throws InsufficientFundsException {
            if(amount > balance) throw new InsufficientFundsException("Withdrawal failed: requested ₹" + amount + " but available ₹" + balance);
            balance -= amount;
            System.out.println("Please collect your cash: ₹" + amount + ". Remaining balance: ₹" + balance);
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM(10000);
        try {
            atm.withdraw(15000);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
