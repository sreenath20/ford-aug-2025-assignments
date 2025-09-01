package com.demo.Assignment4;

public class Restaurant_Order {
    public static void main(String[] args){
        Pizza pizza = new Pizza("Margherita");
        pizza.prepare();
        pizza.deliver(5);
        Burger burger= new Burger("Veggie Burger");
        burger.prepare();
        burger.deliver(2);
    }
}
abstract class MenuItem{
    String itemName;
    MenuItem(String itemName){
        this.itemName=itemName;
    }
     abstract void prepare();
}
interface Deliverable{
    void deliver(int tableNumber);
}
class Pizza extends MenuItem implements Deliverable {
        Pizza(String itemName){
            super(itemName);
        }
    @Override
    public void deliver(int tableNumber) {
        System.out.println("Delivering pizza to table " + tableNumber);
    }
    void prepare(){
        System.out.println("Preparing pizza "+itemName);
    }
}
class Burger extends MenuItem implements Deliverable {
        Burger(String itemName){
            super(itemName);

        }

        void prepare(){
            System.out.println("Preparing burger "+itemName);
        }

    @Override
    public void deliver(int tableNumber) {
        System.out.println("Delivering burger "+tableNumber);
    }
}
