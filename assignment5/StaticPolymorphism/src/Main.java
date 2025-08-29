//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MathOperations math = new MathOperations();
        int [] integerArray= {1,2,3,4,5};
        System.out.println("sum of all the elements in the array :"+math.add(integerArray));
        System.out.println("sum of 2 integers :"+math.add(2,2));
        System.out.println("sum of 2 doubles :"+math.add(3.2,3.5));
    }
}