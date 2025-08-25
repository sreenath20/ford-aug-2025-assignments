package assignment_02.part1;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n-----    Menu-Driven Calculator    -----");
        /*Write a Java program using a switch statement to perform one of the following operations based
        on user input: Add, Subtract, Multiply, Divide.*/
        System.out.println("Number 1: ");
        double number1 = sc.nextDouble();
        System.out.println("Number 2: ");
        double number2 = sc.nextDouble();
        System.out.println("Choose an operation (+,-,*,/): ");
        char operation = sc.next().charAt(0);
        switch (operation) {
            case '+':
                System.out.println("Sum of given numbers: " + (number1 + number2));
                break;

            case '-':
                System.out.println("Difference of given numbers: " + (number1 - number2));
                break;
            case '*':
                System.out.println("Multiplication of given numbers: " + (number1 * number2));
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("Divisor cannot be zero");
                } else {
                    System.out.println("Divison of given numbers: : " + (number1 / number2));
                    break;
                }
            default:
                System.out.println("Invalid operation!");
        }
    }
}
