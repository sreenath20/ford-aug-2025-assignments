package day8.Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book(2,"Java Programming","ABC",250.0);
        Book book2 = new Book(4,"Python Programming","DEF",300.0);
        Book book3 = new Book(1,"C++ Programming","GHI",200.45);
        Book book4 = new Book(5,"Data Science","JKL",189.99);
        Book book5 = new Book(3,"Data Analyst","MNO",299.95);
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
