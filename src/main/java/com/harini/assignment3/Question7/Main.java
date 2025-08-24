package com.harini.assignment3.Question7;

public class Main {
    public static void main(String[] args) {
        Books[] book = new Books[3];
        book[0] = new AudioBook("Java Basics","John Doe","123456",546.98,"10hr","Siva Prasath");
        book[1]= new PrintedBook("SpringBoot Applications","Jane Smith","234156",354.87,1098,"Hard Cover");
        book[2] = new Ebook("Python Basics","Tom Lee","548723",339.87,"210kb","PDF");
        for(int i =0;i<book.length;i++){
            System.out.println("------------Details of Book "+(i+1)+"---------------");
            book[i].displayDetails();
        }
    }
}
