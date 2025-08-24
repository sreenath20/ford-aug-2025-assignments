package day5.assignment5_polymorphisam.Static;

public class MathOperations {
    public Integer add(Integer a,Integer b){
        System.out.println("Adding "+a+"+"+b);
        return a+b;
    }
    public Double add(Double a,Double b){
        System.out.println("Adding "+a+"+"+b);
        return a+b;
    }
    public int add(int[] arr){
        System.out.println("Adding array");
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
}
