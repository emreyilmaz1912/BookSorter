import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>();
        TreeSet<Book> books2 = new TreeSet<>(new OrderNumberOfPageComparable());

        books.add(new Book("Savaş ve Barış", "Leo Tolstoy", 359));
        books.add(new Book("Madame Bovary", "Gustave Flaubert", 785));
        books.add(new Book("Emma", "Jane Austen", 506));
        books.add(new Book("Serenad", "Zülfü Livaneli", 596));
        books.add(new Book("Tehlikeli Oyunlar", "Oğuz Atay", 458));

        for (Book bookList : books) {
            System.out.println(bookList.getBookName());

        }
        for (Book book : books) {  // books'taki kitapları books2'ye ekler.
            books2.add(book);
        }
        System.out.println("------------------------------------------");

        for (Book bk : books2) {
            System.out.println(bk.getBookName());
        }
    }
}