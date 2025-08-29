import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CheckOut checkout = new CheckOut();
        System.out.println("Enter the price: ");
        String price=scanner.nextLine();
        System.out.println("Enter the quantity: ");
        String quantity=scanner.nextLine();

        try{
            double amount=Double.parseDouble(price);
            int quantityInt = Integer.parseInt(quantity);
            System.out.println("Total price of the products :"+checkout.calculateTotal(amount,quantityInt));
            System.out.println();

        }
        catch (NumberFormatException e) {
            System.out.println("enter numbers!");
        }
        catch (IllegalArgumentException e){
            System.out.println("Invalid input");
        }
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            System.out.println("Checkout process completed!");
            scanner.close();
        }

    }
}