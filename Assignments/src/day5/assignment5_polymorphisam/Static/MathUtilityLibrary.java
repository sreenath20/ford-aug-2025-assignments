package day5.assignment5_polymorphisam.Static;

public class MathUtilityLibrary {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        MathOperations mathOperations = new MathOperations();
        System.out.println("Sum: "+mathOperations.add(5,6));
        System.out.println("Sum: "+mathOperations.add(6.6,4.5));
        System.out.println("Sum: "+mathOperations.add(arr));
    }
}
