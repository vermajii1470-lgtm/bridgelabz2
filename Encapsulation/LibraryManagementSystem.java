abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem();
}

class Book extends LibraryItem implements Reservable {
    public Book(int id, String t, String a) { super(id, t, a); }
    public int getLoanDuration() { return 14; }
    public void reserveItem() { System.out.println("Book Reserved!"); }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem item = new Book(1, "Java", "James Gosling");
        System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
        ((Reservable)item).reserveItem();
    }
}
