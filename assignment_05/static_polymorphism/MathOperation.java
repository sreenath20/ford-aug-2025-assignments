package assignment_05.static_polymorphism;

public class MathOperation {
    public int add(int a, int b) {
        System.out.println("Using Integer Addition Method");
        return a + b;
    }

    public double add(double a, double b) {
        System.out.println("Using Double Addition Method");
        return a + b;
    }

    public int add(int[] numbers) {
        System.out.println("Using Array Addition Method");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("\nMath Utility Library (using Static Polymorphism)\n");

        MathOperation operation = new MathOperation();

        int result1 = operation.add(10, 20);
        System.out.println("Result: 10 + 20 = " + result1);
        System.out.println();

        double result2 = operation.add(5.5, 3.7);
        System.out.println("Result: 5.5 + 3.7 = " + result2);
        System.out.println();

        int[] numbers = {1, 2, 3, 4, 5};
        int result3 = operation.add(numbers);
        System.out.print("Result: Adding array [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("] = " + result3);
        System.out.println();
    }
}
