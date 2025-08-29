package day8.Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book(1,"Talk1","Rinku",463.0);
        Book book2 = new Book(2,"Talk2","Vinny",299.9);
        Book book3 = new Book(3,"Talk3","kumar",2400.45);
        Book book4 = new Book(4,"Talk4","Giri",1819.89);
        Book book5 = new Book(5,"Talk5","Quartz",2678.95);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        System.out.println(bookList);
        Collections.sort(bookList);
        System.out.println(bookList);
        bookList.sort(new AuthorNameComparator());
        System.out.println(bookList);
        bookList.sort(new PriceComparator());
        System.out.println(bookList);

    }
}
