package javatopic.day6polymorphism.assignmnent.assignment1;

public class Main {
    public static void main(String[] args) {
        int[] a=new int[2];
        a[0]=1;
        a[1]=2;
        MathOperations math=new MathOperations();
        math.add(10,10);
        math.add(20.0,20.0);
        math.add(a);

    }
}
