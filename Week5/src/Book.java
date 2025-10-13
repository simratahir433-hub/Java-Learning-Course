public class Book {
    String title;
    String author;
    int publicationYear;

    // Method to display book information
    public void displayBookInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("-----------------------------------");
    }
}