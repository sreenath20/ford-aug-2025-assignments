package javatopic.day6polymorphism.assignmnent.assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Payment payment = null;
        CreditCardPayment creditCardPayment =new CreditCardPayment();
        UPIPayment upiPayment=new UPIPayment();
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("enter number to select the payment method");
        System.out.println("1.CreditCard Payment");
        System.out.println("2.UPI Payment");
        input = sc.nextInt();
        switch (input) {
            case 1:
                payment = creditCardPayment;
                break;
            case 2:
                payment = upiPayment;
                break;
            default:
                System.out.println("Invalid input");
        }
        payment.processPayment(100.0);

    }
}
