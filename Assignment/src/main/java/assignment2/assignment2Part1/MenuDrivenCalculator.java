package assignment2.assignment2Part1;

import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {

        Double numberOne;
        Double numberTwo;
        Integer operation;
        Double result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        numberOne = scanner.nextDouble();
        System.out.println("Please enter the second number : ");
        numberTwo = scanner.nextDouble();
        System.out.println("Please select an operation to perform :");
        System.out.println("1. Addition  2. Subtraction 3. Multiplication 4.Division");
        operation = scanner.nextInt();

        switch (operation) {
            case 1:
                result = numberOne + numberTwo;
                System.out.println("The result after addition is : " + result);
                break;

            case 2:
                if (numberOne > numberTwo) {
                    result = numberOne - numberTwo;
                    System.out.println("The result after subtraction is : " + result);
                    break;
                } else {
                    result = numberTwo - numberOne;
                    System.out.println("The result after subtraction is : " + result);
                    break;
                }

            case 3:
                result = numberOne * numberTwo;
                System.out.println("The result after multiplication is : " + result);
                break;
            case 4:
                result = numberOne / numberTwo;
                System.out.println("The result after division is : " + result);
                break;

        }
    }
}
