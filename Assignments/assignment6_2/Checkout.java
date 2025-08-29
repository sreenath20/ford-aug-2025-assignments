package com.assignments.assignment6_2;

public class Checkout {

    public void calculateTotal(Double price, Integer quantity) throws Exception{
        if(price <= 0 || quantity <= 0) {
            throw  new IllegalArgumentException("Price & Quantity must be greater than 0.");
        }
        System.out.println("Total Price: "+(price*quantity));
    }
}
