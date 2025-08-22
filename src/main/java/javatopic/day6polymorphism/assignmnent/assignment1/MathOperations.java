package javatopic.day6polymorphism.assignmnent.assignment1;

public class MathOperations {


    public void add(int a,int b){
        System.out.println("Integer addition");
        System.out.println(a+b);
    }
    public void add(double a,double b){
        System.out.println("double addition");
        System.out.println(a+b);
    }
    public void add(int[] a){
        System.out.println("array addition");
        System.out.print(a[0]+a[1]);
    }
}
