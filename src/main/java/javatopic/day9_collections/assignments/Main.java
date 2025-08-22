package javatopic.day9_collections.assignments;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Book> booklist=new ArrayList<Book>();

        // create

        booklist.add(new Book(101,"heidi","Alan",500.0));
        booklist.add(new Book(102,"golden temple","David",100.0));
        booklist.add(new Book(103,"modern life","Bob",200.0));
        booklist.add(new Book(104,"ages","Aura",400.0));
        booklist.add(new Book(105,"restart","Clara",600.0));
        System.out.println("book list details"+booklist);
        System.out.println("----------------------------------------------------------");
        //comparator
        System.out.println("booklist sort by author");
        booklist.sort(new BookAuthorComparator());
        System.out.println(booklist);

        System.out.println("----------------------------------------------------------");
        System.out.println("booklist sort by price");
        booklist.sort(new BookPriceComparator());
        System.out.println(booklist);

        System.out.println("-----------------------------------------------------");
        //comparable
        System.out.println("booklist sort by title");
        Collections.sort(booklist);
        System.out.println(booklist);









    }
}
