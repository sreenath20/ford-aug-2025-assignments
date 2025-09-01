package com.demo.Assignment8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        List<Book> bookList=new ArrayList<Book>();
        bookList.add(new Book(1,"THe box",500.89,"xyz"));
        bookList.add(new Book(2,"Three Man in a boat",600.89,"Aky"));
        bookList.add(new Book(3,"Harry Potter",4500.89,"Ay"));
        bookList.add(new Book(4,"hellen",450.89,"kishde"));
        bookList.add(new Book(5,"Gullivers Travel",500.89,"kein"));
        Collections.sort(bookList);
        System.out.println(bookList);
        bookList.sort(new ComparatorByPrice());
        bookList.sort(new ComparatorByAuthor());
        System.out.println(bookList);

    }
}
