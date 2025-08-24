package assignment5.assignment5Polymorphism;

import java.util.Scanner;

public class Driver {

   public static void main(String[] args) {
       int[] a = {1,3,5};
       MathOperations mathOperations = new MathOperations();
        mathOperations.add(2,2);
        mathOperations.add(5.5,8.5);
        mathOperations.add(a);

   //Dynamic Polymorphism
       Payment payment = new Payment();
       CreditCardPayment creditCardPayment = new CreditCardPayment();
       UPIPayment upiPayment = new UPIPayment();
       Payment objectRef;
       objectRef = payment;
       objectRef.processPayment(6770.1);
       objectRef = creditCardPayment;
       objectRef.processPayment(8981.34);
       objectRef = upiPayment;
       objectRef.processPayment(688.7);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the way how you want to pay: ");
        System.out.print("1 - Credit Card Payment  2 - UPI Payment  ");
        int inputOption = input.nextInt();
        input.nextLine();
        if (inputOption == 1) {
            objectRef = creditCardPayment;
            objectRef.processPayment(555.5);

        }
        else if (inputOption == 2) {
            objectRef = upiPayment;
            objectRef.processPayment(99.5);
        }
   // Interface Static Method
        DataValidator.isNotEmpty("Hello");

   // Interface Default Method
        MP3Player mp3Player = new MP3Player();
        mp3Player.play("BTS");
        mp3Player.stop();
        WAVPlayer wavPlayer = new WAVPlayer();
        wavPlayer.play("WAV");
        wavPlayer.stop();
        //MusicPlayer.stop();

   }
}
