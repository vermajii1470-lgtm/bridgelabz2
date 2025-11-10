public class Q14_BankTransactionManager {
    static class AccountNotFoundException extends Exception { public AccountNotFoundException(String m){ super(m);} }
    static class InsufficientFundsException extends Exception { public InsufficientFundsException(String m){ super(m);} }

    static void verifyAccount(String acc) throws AccountNotFoundException {
        if(!"ACC123".equals(acc)) throw new AccountNotFoundException("Account " + acc + " not found.");
    }

    static void processTransaction(String acc, int amount) throws InsufficientFundsException {
        int balance = 500;
        if(amount > balance) throw new InsufficientFundsException("Insufficient funds for amount " + amount);
    }

    static void executeTransaction(String acc, int amount) throws Exception {
        verifyAccount(acc);
        processTransaction(acc, amount);
        System.out.println("Transaction executed.");
    }

    public static void main(String[] args) {
        try {
            executeTransaction("ACC999", 600);
        } catch (AccountNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other error: " + e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
    }
}
