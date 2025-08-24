package com.fullstackabi.assignment.Assign3.EncapsulationInheritance;

import com.fullstackabi.assignment.Assign3.EncapsulationInheritance.Ex1EmpMgmntSystem.Employee;
import com.fullstackabi.assignment.Assign3.EncapsulationInheritance.Ex1EmpMgmntSystem.Manager;
import com.fullstackabi.assignment.Assign3.EncapsulationInheritance.Ex7LibraryMgmntSystem.AudioBook;
import com.fullstackabi.assignment.Assign3.EncapsulationInheritance.Ex7LibraryMgmntSystem.Book;
import com.fullstackabi.assignment.Assign3.EncapsulationInheritance.Ex7LibraryMgmntSystem.EBook;
import com.fullstackabi.assignment.Assign3.EncapsulationInheritance.Ex7LibraryMgmntSystem.PrintedBook;

import java.util.ArrayList;
import java.util.List;

public class Assign3Driver {

    public static void main(String[] args) {

        // Employee Management System - Ex1
        System.out.println("******************Employee Management System**********************");
        Employee emp = new Employee(100, "Jim", "ADMIN", 10000.00);
        Employee emp2 = new Employee(101, "Bob", "IT", 10000.00);
        Employee emp3 = new Employee(102, "Jim", "HR", 10000.00);

        System.out.println("Employee Details:" + emp);
        Manager manager = new Manager(100, "Jim", "ADMIN", 10000.00, 3, "ERP");
        manager.displayProjectDetails();
        System.out.println("=====================================================================================");

        System.out.println("******************Library Management System**************************");
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Fundamentals","James",1234567,500.00));
        books.add(new Book("Java Advanced ","Jim",12345678,1500.00));
        books.add(new Book("Java SpringBoot","Patrick",123456789,2500.00));

        PrintedBook printedBook = new PrintedBook();

        for(Book book:books){
            printedBook.setTitle(book.getTitle());
            printedBook.setPrice(book.getPrice());
            printedBook.setAuthor(book.getAuthor());
            printedBook.setISBN(book.getISBN());
            printedBook.displayFields(1000,"Lamination");
        }

        EBook ebook = new EBook();

        for(Book book:books){
            ebook.setTitle(book.getTitle());
            ebook.setPrice(book.getPrice());
            ebook.setAuthor(book.getAuthor());
            ebook.setISBN(book.getISBN());
            ebook.displayFields(10,"pdf");
        }

        AudioBook audioBook = new AudioBook();

        for(Book book:books){
            audioBook.setTitle(book.getTitle());
            audioBook.setPrice(book.getPrice());
            audioBook.setAuthor(book.getAuthor());
            audioBook.setISBN(book.getISBN());
            audioBook.displayFields(5,"Patrick");
        }


    }
}
