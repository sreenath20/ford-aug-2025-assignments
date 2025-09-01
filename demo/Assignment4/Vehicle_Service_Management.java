package com.demo.Assignment4;
public class Vehicle_Service_Management {
}
abstract class Vehicle{
    String brandName;
    String Model;
    public abstract void service();
    Vehicle(String brandName,String Model){
        this.brandName=brandName;
        this.Model=Model;
    }
}
interface Repairable{
    void repair();
}
class cars extends Vehicle implements Repairable{
 cars(String brandName,String Model){
     super(brandName,Model);
 }

    @Override
    public void repair() {
        System.out.println("car got repaired");
    }

    @Override
    public void service() {
        System.out.println("car got service");
    }
}
class bike extends Vehicle implements Repairable{
    bike(String brandName,String Model){
        super(brandName,Model);
    }
    @Override
    public void repair() {
        System.out.println("bike got repair");

    }
    @Override
    public void service() {
        System.out.println("bike got service");
    }

}
class Main2{
    public static void main(String[] args) {
        bike b1= new bike("herohonda","201a");
        b1.service();
        b1.repair();
        cars c1= new cars("BMW","201B");
        c1.service();
        c1.repair();
    }
}

