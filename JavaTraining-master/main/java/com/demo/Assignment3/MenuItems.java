package com.demo.Assignment3;
//---------------Assignment 8
public class MenuItems {
    private String Name;
    private int Price;
    private String Type;
    public MenuItems(String name, int price, String type) {
        Name = name;
        Price = price;
        Type = type;
    }
    public String getName() {
        return Name;
    }
    public int getPrice() {
        return Price;
    }
    public String getType() {
        return Type;
    }
}
class VegItems extends MenuItems {
  String spiceLevel;
  Double calories;
    public VegItems(String name, int price, String type,Double calories,String spiceLevel) {
        super(name,price,type);
        this.spiceLevel=spiceLevel;
        this.calories=calories;
    }
    public void display(){
        System.out.println("Name: "+getName()+" Price: "+getPrice()+" Type: "+getType()+"Calories:"+calories+" Spice Level:"+spiceLevel);
    }
}
class NonVegItems extends MenuItems {
    String spiceLevel;
    Double calories;
    public NonVegItems(String name, int price, String type,Double calories,String spiceLevel) {
        super(name,price,type);
        this.spiceLevel=spiceLevel;
        this.calories=calories;
    }
    public void display(){
        System.out.println("Name: "+getName()+" Price: "+getPrice()+" Type: "+getType()+"Calories:"+calories+" Spice Level:"+spiceLevel);
    }
}
class Main{

    public static void main(String[] args) {
        int count=0;
        VegItems v1= new VegItems("Dosa",55,"XYZ",550.00,"normal");
        count+=v1.getPrice();
        v1.display();
        NonVegItems nv1= new NonVegItems("mutton Biriyani",350,"XYZ",750.00,"high");
        count+=nv1.getPrice();
        nv1.display();
        System.out.println("Total Price: "+count+"\n");
    }
}

