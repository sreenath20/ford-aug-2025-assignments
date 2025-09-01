package com.demo.Assignment7;

public class Ecommerce_order {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        try{
            orderService.placeOrder("Laptop",0);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
class InvalidOrderQuantityException extends RuntimeException{
    InvalidOrderQuantityException(String message){
    }
}
class OrderService{
    void placeOrder(String productName,int quantity) throws InvalidOrderQuantityException{
     if(quantity<=0){
         System.out.println("Placing order for "+productName+" (Quantity)"+quantity);
         throw new InvalidOrderQuantityException("Quantity must be greater than 0");
     }
     else{
         System.out.println("Placing order for "+productName+" (Quantity)"+quantity);
         System.out.println("Order placed successfully");
     }
    }
}