class Book {
    // Static variable shared by all Book instances
    static String libraryName = "City Library";

    // Final variable: ISBN cannot be changed once assigned
    private final String isbn;
    // Instance variables: unique to each book
    private String title;
    private String author;

    // Constructor to initialize book details
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    // Static method to display library name
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Instance method to display book details
    void displayDetails() {
        // Check if the object is an instance of Book (always true here)
        if (this instanceof Book) {
            System.out.println("Title: " + this.title);
            System.out.println("Author: " + this.author);
            System.out.println("ISBN: " + this.isbn);
        }
    }
}
