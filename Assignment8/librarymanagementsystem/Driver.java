package Assignment8.librarymanagementsystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Library> libraryList = new ArrayList<>();
        libraryList.add(new Library(1,"harrypotter","J.K",2500.00));
        libraryList.add(new Library(2,"xyz","hari",1500.00));
        libraryList.add(new Library(3,"harry","harry",3500.00));
        libraryList.add(new Library(4,"harry","harry",3500.00));
        libraryList.add(new Library(5,"abc","potter",2300.00));
        System.out.println(libraryList);
        System.out.println("-----Sorting Using Title-----");
        Collections.sort(libraryList);
        System.out.println(libraryList);
        //Comparator
        libraryList.sort(new LibraryPriceComparator());
        System.out.println("-----Sort by price using Comparator-----");
        System.out.println(libraryList);

        libraryList.sort(new LibraryAuthorComparator());
        System.out.println("-----Sort by author using Comparator-----");
        System.out.println(libraryList);


    }
}
