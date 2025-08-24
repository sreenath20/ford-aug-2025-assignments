package day1;

import java.util.Scanner;

//Assignment 6.2.1
public class ATM {
    private double balance;
    public ATM(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) {
        if(amount<=0){
            throw new IllegalArgumentException("Amount must be greater than 0.");

        }
        if(amount>balance){
            throw new ArithmeticException("Insufficient balance.");
        }
        balance-=amount;
        System.out.println("Withdraw Successful.Remaining balance:"+balance);
    }

    public static void main(String[] args) {
        ATM atm = new ATM(5006.02);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw:");
        try{
            Double amount=sc.nextDouble();
            atm.withdraw(amount);
        }catch (NumberFormatException e){
            System.out.println("Enter Valid Number");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }finally{
            sc.close();
        }
    }
}
