import java.util.Scanner;

public class Invoicecalculator {
    public static void main(String[] args) {
        int totalInvoiceAmount = 0;
        Scanner input = new Scanner(System.in);
        for (int item = 0; item < 5; item++) {

            int product = input.nextInt();
            totalInvoiceAmount += product;


        }
        System.out.println("Total Invoice Amount: " + totalInvoiceAmount);
    }
}
