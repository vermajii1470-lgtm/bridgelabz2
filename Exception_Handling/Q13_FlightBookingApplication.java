public class Q13_FlightBookingApplication {
    static class SeatUnavailableException extends Exception { public SeatUnavailableException(String m){ super(m);} }
    static class PaymentFailedException extends Exception { public PaymentFailedException(String m){ super(m);} }

    static void checkSeatAvailability(String seat) throws SeatUnavailableException {
        if("1A".equals(seat)) throw new SeatUnavailableException("Seat " + seat + " not available.");
    }

    static void processPayment(boolean ok) throws PaymentFailedException {
        if(!ok) throw new PaymentFailedException("Payment declined.");
    }

    static void bookTicket(String seat, boolean paymentOk) throws Exception {
        checkSeatAvailability(seat);
        processPayment(paymentOk);
        System.out.println("Ticket booked for seat " + seat);
    }

    public static void main(String[] args) {
        try {
            bookTicket("1A", true);
        } catch (SeatUnavailableException e) {
            System.out.println("Booking failed: " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println("Booking failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Booking failed: " + e.getMessage());
        } finally {
            System.out.println("Thank you for booking with us!");
        }
    }
}
