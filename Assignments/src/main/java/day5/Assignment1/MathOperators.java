package day5.Assignment1;

public class MathOperators {
    public void sum(int a, int b){
        int sum = a+b;
        System.out.println("The sum of "+a+" and "+b+" is "+sum);
    }
    public void sum(double a, double b){
        double sum = a+b;
        System.out.println("The sum of "+a+" and "+b+" is "+sum);
    }
    public void sum(int[] numbers){
        int sum = 0;
        for(int num:numbers){
            sum+=num;
        }
        System.out.println("The sum of the array is "+sum);
    }
}
