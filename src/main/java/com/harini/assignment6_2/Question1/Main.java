package com.harini.assignment6_2.Question1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount you want to withdraw: ");

        try{
            double amount = sc.nextDouble();
            atm.withdraw(amount);
        }
        catch(InputMismatchException ne){
            System.out.println(ne.getMessage());
        }
        catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        catch (IllegalArgumentException ie){
            System.out.println(ie.getMessage());
        }
        finally {
            System.out.println("Thank for using our bank application");
        }
    }
}
