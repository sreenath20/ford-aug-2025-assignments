package assignment6.ExceptionHandling.assignmentD7ExceptnHandling2;

import assignmentD7ExceptnHandling.IllegalArgumentException;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        Scanner scanner = new Scanner(System.in);
        String inputquantity= scanner.next();
        String inputprice= scanner.next();

        try{
            double price=Double.parseDouble(inputprice);
            int quantity=Integer.parseInt(inputquantity);
            checkout.calculateTotal(price,quantity);
        }
        catch(IllegalArgumentException e){
           throw new RuntimeException(e);
        }
        finally{
            System.out.println("Checkout process complete");
        }
    }
}
