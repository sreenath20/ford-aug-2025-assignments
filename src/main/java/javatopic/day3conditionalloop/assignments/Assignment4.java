package javatopic.day3conditionalloop.assignments;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Integer number1;
        Integer number2;
        char operation;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        number1 = sc.nextInt();
        System.out.println("enter the second number");
        number2 = sc.nextInt();
        System.out.println("enter the operation");
        operation = sc.next().charAt(0);
        switch (operation) {
            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                System.out.println(number1 / number2);
                break;
            default:
                System.out.println("Invalid operation");

        }


    }
}
