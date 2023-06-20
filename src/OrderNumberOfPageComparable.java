import java.util.Comparator;

public class OrderNumberOfPageComparable implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getNumberofPages() - o2.getNumberofPages();
    }

}
