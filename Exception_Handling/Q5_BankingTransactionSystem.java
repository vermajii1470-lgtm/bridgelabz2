import java.util.Random;
public class Q5_BankingTransactionSystem {
    static class NegativeAmountException extends Exception { public NegativeAmountException(String m){ super(m);} }
    static class InsufficientFundsException extends Exception { public InsufficientFundsException(String m){ super(m);} }
    static class NetworkFailureException extends Exception { public NetworkFailureException(String m){ super(m);} }

    static class Transaction {
        public void execute() throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {
            int r = new Random().nextInt(3);
            if(r == 0) throw new NegativeAmountException("Transaction amount cannot be negative.");
            if(r == 1) throw new InsufficientFundsException("Not enough funds for this transaction.");
            if(r == 2) throw new NetworkFailureException("Network failure occurred during transaction.");
        }
    }

    public static void main(String[] args) {
        Transaction t = new Transaction();
        try {
            t.execute();
            System.out.println("Transaction successful.");
        } catch (NegativeAmountException e) {
            System.out.println("Transaction error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction error: " + e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println("Transaction error: " + e.getMessage());
        }
    }
}
