package assignment5.assignment5Polymorphism;

public class MathOperations {
int arrsum;
        public void add(int a, int b){
        System.out.println("The result of two integers is : " + (a+b));
        }

        public void add(double a, double b){
        System.out.println("The result of two double is : " + (a+b));
    }

        public void add(int[] a){
            for (int i = 0; i<a.length; i++){
             arrsum = arrsum + a[i];
            }
            System.out.println("The result of array sum is : " + arrsum);
        }
}
