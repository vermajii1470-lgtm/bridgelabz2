class Book {
    private String title;
    private int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Book: " + title + " (" + publicationYear + ")");
    }
}

class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name + " | Bio: " + bio);
    }

    public static void main(String[] args) {
        Author a = new Author("Java Fundamentals", 2023, "John Doe", "Expert in OOP concepts");
        a.displayInfo();
    }
}
