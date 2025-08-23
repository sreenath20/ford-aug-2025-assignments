import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        short data;  //declaration

        data=8;     //assignment
        System.out.println(data);
        int num1=7;
        System.out.println(num1);
        float num2=3.13f; // f stand for float literal
        System.out.println(num2);
        double num3=3.13;
        System.out.println(num3);
        char a='c';
        System.out.println(a);
        System.out.println("Hi cheran");

        Scanner input=new Scanner(System.in);
        String name=input.next();
        String name1 ="cheran";
        if(name.equals("chern")) {
            System.out.println("Hi cheran");
        }
        else {
            System.out.println("Bye cheran");
        }

    }
}
