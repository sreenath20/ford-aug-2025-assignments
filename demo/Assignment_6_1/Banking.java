package com.demo.Assignment_6_1;

public class Banking {
    private int AccountNumber;
    private double Balance;
    private static double interst;
    public Banking(int AccountNumber, double Balance,double interst){

        this.AccountNumber=AccountNumber;
        this.Balance=Balance;
    }
    public double getBalance(){
        return Balance;
    }
    public void setInterst(double interst){
        this.interst=interst;
    }
    public  double updateInterest(double interest){
       setInterst(interest);
        return interest*getBalance();

    }
    public static void display(){
        System.out.println(Banking.interst);
    }

}
class Main12234{
    public static void main(String[] args) {
        Banking banking= new Banking(1,100,0.1);
        banking.updateInterest(0.05);
        banking.updateInterest(100);
        Banking.display();
    }
}
