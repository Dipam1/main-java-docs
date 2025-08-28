// File: Library.java

public class Library {

    static String libraryName;
    String bookTitle;
    String author;

    public Library(String bookTitle, String author) {
        this.bookTitle = bookTitle;
        this.author = author;
    }

    @Override
    public String toString() {
        return "'" + bookTitle + "' by " + author + " (Library: " + libraryName + ")";
    }

    public static void main(String[] args) {
        Library.libraryName = "Community Reading Center";

        Library book1 = new Library("Dune", "Frank Herbert");
        Library book2 = new Library("Foundation", "Isaac Asimov");

        System.out.println("## Initial State:");
        System.out.println(book1);
        System.out.println(book2);

        System.out.println("\n>> Renaming library...\n");
        Library.libraryName = "Central Science Fiction Archive";
        
        System.out.println("## Updated State:");
        System.out.println(book1);
        System.out.println(book2);
    }
}