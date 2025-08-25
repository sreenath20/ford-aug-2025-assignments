package com.demo.Assignment_6_1;

public class E_Commerce {

}
class Order{
    private  static int  totalcount=0;
    private int id;
    private String Name;
    private String ProductName;
    public Order(int id,String Name,String ProductName){
        this.id=id;
        this.Name=Name;
        this.ProductName=ProductName;
        this.totalcount=totalcount+1;
    }
    public void display(){
        System.out.println("Id:" +id+"Name: "+Name+"ProductName: "+ProductName);
    }
    public void totalcount(){
        System.out.println("Total Count: "+totalcount);
    }


}
class main12{
    public static void main(String[] args){
        Order order= new Order(1234,"AK","Amazon");
        Order order1= new Order(12345,"AKf","Amazon1");
        order.display();
        order.totalcount();
    }
}

