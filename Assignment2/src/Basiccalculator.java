import java.util.Scanner;

public class Basiccalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the operation you want to perform");

        System.out.println("Enter first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();
        System.out.println("Enter operation you want to perform");
        String operation=sc.next();
        switch(operation){

            case "add":

                int sum=num1+num2;
                System.out.println(num1+"+"+num2+"="+sum);
                break;
            case "sub":

                 int sub=Math.abs(num1-num2);
                 System.out.println(num1+" - "+num2+"="+sub);
                 break;
            case "mul":

                int mul=num1*num2;
               System.out.println(num1+" * "+num2+"="+mul);
                break;
            case "div":

                int div=num1/num2;
                System.out.println(num1+" / "+num2+"="+div);
                break;
            default:
                System.out.println("Invalid operation");
                break;

        }
    }
}
