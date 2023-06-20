import java.util.Comparator;

public class Book implements Comparable<Book> {

    String bookName;
    String author;
    int numberofPages;

    public Book(String bookName, String author, int numberofPages) {
        this.bookName = bookName;
        this.author = author;
        this.numberofPages = numberofPages;
    }

    @Override
    public int compareTo(Book o) {
        if (o instanceof Book) {
            Book o1 = (Book) o;
            return (this.getBookName().compareTo(o1.getBookName()));
        } else
            return -1;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumberofPages() {
        return numberofPages;
    }

    public void setNumberofPages(int numberofPages) {
        this.numberofPages = numberofPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
