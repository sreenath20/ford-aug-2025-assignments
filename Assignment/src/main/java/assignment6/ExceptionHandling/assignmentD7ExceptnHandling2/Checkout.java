package assignment6.ExceptionHandling.assignmentD7ExceptnHandling2;

import assignmentD7ExceptnHandling.IllegalArgumentException;

public class Checkout {
    Double total;
    public void calculateTotal(double price,int quantity) throws IllegalArgumentException{

        if((price <=0)||(quantity<=0)){
            throw new IllegalArgumentException("Invalid price or quantity.. Please check");
        }
        if((quantity > 0)&(price >0)){
            total=quantity*price;
            System.out.println("Total is "+total);
        }
    }
}
