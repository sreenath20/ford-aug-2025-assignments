import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Book> library = new ArrayList<Book>();
        library.add(new Book(101, "Java Programming", "Alice", 499.99));
        library.add(new Book(102, "Python Essentials", "Bob", 399.50));
        library.add(new Book(103, "Data Structures", "Charlie", 599.00));
        library.add(new Book(104, "Algorithms", "David", 350.75));
        library.add(new Book(105, "Web Development", "Eve", 299.99));

        // sorting by TITLE
        Collections.sort(library);
        System.out.println();
        System.out.println("Sorted by Title: ");
        for (Book book : library) {
            System.out.println(book.toString());
        }
        System.out.println();


        //Sorting by Price
        System.out.println("Sorted by Price: ");
        library.sort(new PriceComparator());
        for (Book book : library) {
            System.out.println(book.toString());
        }
        System.out.println();


        //Sorting by author
        System.out.println("Sorted by Author: ");
        library.sort(new AuthorComparator());
        for (Book book : library) {
            System.out.println(book.toString());
        }
    }
}