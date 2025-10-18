public class BookApp {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Peer e Kamil";
        book1.author = "Umera Ahmed";
        book1.publicationYear = 2004;

        Book book2 = new Book();
        book2.title = "The Alchemist";
        book2.author = "Paulo Coelho";
        book2.publicationYear = 1988;

        Book book3 = new Book();
        book3.title = "Pride and Prejudice";
        book3.author = "Jane Austen";
        book3.publicationYear = 1813;

        book1.displayBookInfo();
        book2.displayBookInfo();
        book3.displayBookInfo();
    }
}