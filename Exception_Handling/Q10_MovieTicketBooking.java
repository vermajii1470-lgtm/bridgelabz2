import java.util.*;
public class Q10_MovieTicketBooking {
    static class InvalidSeatException extends Exception { public InvalidSeatException(String m){ super(m);} }
    static class SeatAlreadyBookedException extends Exception { public SeatAlreadyBookedException(String m){ super(m);} }

    private Map<String, Boolean> seats = new HashMap<>(); // seat -> available

    public Q10_MovieTicketBooking() {
        seats.put("A1", true);
        seats.put("A2", true);
        seats.put("A3", true);
    }

    public void bookSeat(String seat) throws InvalidSeatException, SeatAlreadyBookedException{
        Boolean exists = seats.get(seat);
        if(exists == null) throw new InvalidSeatException("Seat " + seat + " does not exist.");
        if(!exists) throw new SeatAlreadyBookedException("Seat " + seat + " already booked.");
        seats.put(seat, false);
        System.out.println("Seat " + seat + " successfully booked.");
    }

    public static void main(String[] args) {
        Q10_MovieTicketBooking app = new Q10_MovieTicketBooking();
        try {
            app.bookSeat("A4");
        } catch (Exception e) {
            System.out.println("Booking error: " + e.getMessage());
        }
    }
}
