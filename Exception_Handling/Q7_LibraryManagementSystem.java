import java.util.*;
public class Q7_LibraryManagementSystem {
    static class BookNotAvailableException extends Exception { public BookNotAvailableException(String m){ super(m);} }
    static class InvalidReturnException extends Exception { public InvalidReturnException(String m){ super(m);} }
    static class UserLimitExceededException extends Exception { public UserLimitExceededException(String m){ super(m);} }

    private Map<String, Boolean> books = new HashMap<>(); // title -> available
    private Map<String, List<String>> userRecords = new HashMap<>(); // user -> list of borrowed books

    public Q7_LibraryManagementSystem() {
        books.put("Java101", true);
        books.put("Algorithms", true);
        books.put("DesignPatterns", true);
    }

    public void borrowBook(String user, String title) throws BookNotAvailableException, UserLimitExceededException {
        List<String> borrowed = userRecords.getOrDefault(user, new ArrayList<>());
        if(borrowed.size() >= 5) throw new UserLimitExceededException("User " + user + " has exceeded borrow limit.");
        Boolean avail = books.get(title);
        if(avail == null || !avail) throw new BookNotAvailableException("Book '" + title + "' is not available.");
        borrowed.add(title);
        userRecords.put(user, borrowed);
        books.put(title, false);
        System.out.println(user + " borrowed '" + title + "'.");
    }

    public void returnBook(String user, String title) throws InvalidReturnException {
        List<String> borrowed = userRecords.get(user);
        if(borrowed == null || !borrowed.remove(title)) throw new InvalidReturnException("Return invalid: '" + title + "' was not borrowed by " + user);
        books.put(title, true);
        System.out.println(user + " returned '" + title + "'.");
    }

    public static void main(String[] args) {
        Q7_LibraryManagementSystem lib = new Q7_LibraryManagementSystem();
        try {
            lib.borrowBook("alice", "Java101");
            lib.borrowBook("alice", "Algorithms");
            lib.returnBook("alice", "DesignPatterns"); // invalid
        } catch (Exception e) {
            System.out.println("Operation failed: " + e.getMessage());
            e.printStackTrace(System.out);
        }
    }
}
