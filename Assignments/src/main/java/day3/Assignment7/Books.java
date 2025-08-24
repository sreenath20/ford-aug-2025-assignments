package day3.Assignment7;

public class Books {
    String name;
    String author;
    String ISBN;
    double price;

    public Books(String name, String author, String ISBN, double price) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }
    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Price: " + price);
    }

}
