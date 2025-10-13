public class BookApp {
    public static void main(String[] args) {
        // Creating first Book object
        Book book1 = new Book();
        book1.title = "Peer e Kamil";
        book1.author = "Umera Ahmed";
        book1.publicationYear = 2004;
        book1.displayBookInfo();

        // Creating second Book object
        Book book2 = new Book();
        book2.title = "The Alchemist";
        book2.author = "Paulo Coelho";
        book2.publicationYear = 1988;
        book2.displayBookInfo();

        // Creating third Book object
        Book book3 = new Book();
        book3.title = "Pride and Prejudice";
        book3.author = "Jane Austen";
        book3.publicationYear = 1813;
        book3.displayBookInfo();
    }
}