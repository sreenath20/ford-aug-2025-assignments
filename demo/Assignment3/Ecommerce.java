package com.demo.Assignment3;
//--------------------Assignment 3---------------------------
public class Ecommerce {
    private int productId;
    private String Name;
    private double Price;
    private String description;
    public Ecommerce(int productId, String Name, double Price, String description) {
        this.productId = productId;
        this.Name = Name;
        this.Price = Price;
        this.description = description;
    }
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return Name;
    }
    public double getPrice() {
        return Price;
        }
    public String getDescription() {
        return description;
        }
        public static void main(String[] args) {
        Electronics E1= new Electronics(1233,"Abinash",256.2,"this is an electronic item",2);
        Grocery g1=new Grocery(1245,"Kishore",45.6,"packed before 6 month","25/6/2020");
        E1.display();
        g1.display();
        }

}
class Electronics extends Ecommerce {
    int warantyPeriod;
    Electronics(int productId, String Name, double Price, String description,int warantyPeriod) {
        super(productId,Name,Price,description);
        this.warantyPeriod=warantyPeriod;
    }
    public void display(){
        System.out.println("ProductId"+getProductId()+" Name"+getName()+" Price"+getPrice()+" Description"+getDescription());
        System.out.println("Waranty period: "+warantyPeriod);
    }
}
class Grocery extends Ecommerce {
    String  expiryDate;
    Grocery(int productId, String Name, double Price, String description,String expiryDate) {
        super(productId,Name,Price,description);
        expiryDate=expiryDate;
    }
    public void display(){
        System.out.println("ProductId"+getProductId()+" Name"+getName()+" Price"+getPrice()+" Description"+getDescription());
        System.out.println("Expiry date"+expiryDate);
    }
}
class Clothing extends Ecommerce {
    String fabric;
    int cloth_size;
    Clothing(int productId, String Name, double Price, String description,String fabric,int cloth_size) {
        super(productId,Name,Price,description);
        this.fabric=fabric;
        this.cloth_size=cloth_size;
    }
    public void display(){
        System.out.println("productId"+getProductId()+" Name"+getName()+" Price"+getPrice()+" Description"+getDescription());
        System.out.println("Fabric size"+fabric);
        System.out.println("cloth size"+cloth_size);
    }

}
