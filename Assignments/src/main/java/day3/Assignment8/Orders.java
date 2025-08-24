package day3.Assignment8;

import java.util.ArrayList;

public class Orders{
    ArrayList<MenuItem> menuList = new ArrayList<>();
    public void addItem(MenuItem item){
        menuList.add(item);
    }
    public void displayOrders(){
        for(int i=0;i<menuList.size();i++){
            System.out.println("-----------------------------The detail of Order "+(i+1)+"---------------------------------");
            menuList.get(i).displayDetails();
        }
    }
    public double totalPrice(){
        double totalPrice = 0;
        for(MenuItem item:menuList){
            totalPrice+= item.price;
        }
        return totalPrice;
    }
}
