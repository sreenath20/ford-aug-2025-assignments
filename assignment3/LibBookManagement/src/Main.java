import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Book> books=new ArrayList<>();
        books.add(new PrintedBook("The Great Gatsby", "F. Scott Fitzgerald", 978074327, 10.99, 180, "Hardcover"));
        books.add(new EBook("1984", "George Orwell", 978045152, 5.99,  2.5, "PDF"));
        books.add(new AudioBook("Becoming", "Michelle Obama", 9780525, 14.99, "19 hrs 3 mins", "Michelle Obama"));

        for(Book book:books){
            book.displayDetails();
            System.out.println("_________________________________");
        }
    }


}