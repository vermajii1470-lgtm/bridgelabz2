import java.util.Random;
public class Q4_OnlineOrderProcessing {
    static class OutOfStockException extends Exception { public OutOfStockException(String m){ super(m); } }
    static class PaymentFailedException extends Exception { public PaymentFailedException(String m){ super(m); } }

    static void placeOrder() throws OutOfStockException, PaymentFailedException {
        int r = new Random().nextInt(3); // 0 success, 1 out of stock, 2 payment fail
        if(r == 1) throw new OutOfStockException("The product is out of stock.");
        if(r == 2) throw new PaymentFailedException("Payment processing failed.");
        System.out.println("Order placed successfully!");
    }

    public static void main(String[] args) {
        try {
            placeOrder();
        } catch (OutOfStockException e) {
            System.out.println("Order failed: " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println("Order failed: " + e.getMessage());
        }
    }
}
