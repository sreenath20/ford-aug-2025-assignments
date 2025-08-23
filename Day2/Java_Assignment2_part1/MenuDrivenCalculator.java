

import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double a = Double.parseDouble(sc.nextLine().trim());
            System.out.print("Enter second number: ");
            double b = Double.parseDouble(sc.nextLine().trim());

            System.out.println("Choose operation: +  -  *  /");
            System.out.print("Enter operator: ");
            String op = sc.nextLine().trim();

            switch (op) {
                case "+":
                    System.out.printf("Result: %.4f%n", a + b);
                    break;
                case "-":
                    System.out.printf("Result: %.4f%n", a - b);
                    break;
                case "*":
                    System.out.printf("Result: %.4f%n", a * b);
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("Error: Division by zero");
                    } else {
                        System.out.printf("Result: %.4f%n", a / b);
                    }
                    break;
                default:
                    System.out.println("Invalid operator");
            }
        }
    }
}
