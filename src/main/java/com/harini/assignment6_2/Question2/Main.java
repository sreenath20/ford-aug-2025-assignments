package com.harini.assignment6_2.Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CheckOut c = new CheckOut();
        Scanner sc = new Scanner(System.in);
        //String name = sc.nextLine();
        try{
            System.out.print("Enter the quantity : ");
            int quatity=Integer.parseInt(sc.nextLine());
            System.out.print("Enter the price : ");
            double price=Double.parseDouble(sc.nextLine());
            c.calculateTotal(price,quatity);
        }
        catch(NumberFormatException ie){
            System.out.println(ie.getMessage());
        }
        catch (ArithmeticException ie){
            System.out.println(ie.getMessage());
        }
        catch (IllegalArgumentException ie){
            System.out.println(ie.getMessage());
        }
        finally{
            System.out.println("Checkout process complete");
        }
    }
}
