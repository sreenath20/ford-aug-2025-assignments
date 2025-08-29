import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product name:");
        String productName = input.nextLine();

        System.out.println("Enter the quantity:");
        int quantity = input.nextInt();

        OrderService orderService = new OrderService();
        try{
        orderService.placeOrder(productName,quantity);
        }
        catch(InvalidOrderQuantityException e)
        {
            System.out.println("Error: "+e.getMessage());
        }
    }
}