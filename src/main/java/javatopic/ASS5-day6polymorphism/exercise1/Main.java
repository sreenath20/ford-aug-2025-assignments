package javatopic.day6polymorphism.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        Payment p1 ;
        CashPayment cashPayment = new CashPayment();
        UpiPayment upiPayment = new UpiPayment();
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        System.out.println(" enter 1-CreditCardPayment   2-UpiPayment    3-Cashpayment");
        choice = input.nextInt();
        if(choice == 1) {
            p1=creditCardPayment;
            p1.processPayment(100.0);
        }
        else if(choice == 2) {
            p1=upiPayment;
            p1.processPayment(200.0);

        }
        else if(choice == 3) {
            p1=cashPayment;
            p1.processPayment(300.0);

        }

    }
}
