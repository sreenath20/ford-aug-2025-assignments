package Assignment5.StaticPolymorphism;

public class Driver {
        public static void main(String[] args) {
            MathOperations math = new MathOperations();

            System.out.println("Addition of two integers: " + math.add(10, 20));
            System.out.println("Addition of two doubles: " + math.add(5.5, 3.2));
            System.out.println("Addition of integer array: " + math.add(new int[]{1, 2, 3, 4, 5}));
        }

}
