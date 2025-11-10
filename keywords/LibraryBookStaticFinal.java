
public class LibraryBookStaticFinal {
    private static String libraryName = "City Library";
    private static int totalBooks = 0;

    private final String isbn;
    private String title;
    private String author;

    public LibraryBookStaticFinal(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
    }

    public static void displayLibraryName() { System.out.println(libraryName); }

    public String detailsIfInstance(Object obj) {
        if (obj instanceof LibraryBookStaticFinal) {
            LibraryBookStaticFinal b = (LibraryBookStaticFinal) obj;
            return b.title + ", " + b.author + ", " + b.isbn + ", " + libraryName;
        }
        return "Not a Book";
    }

    public String getIsbn() { return isbn; }
}
