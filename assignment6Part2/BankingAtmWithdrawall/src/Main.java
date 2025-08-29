import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        // the initial balance is 10,000
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        String withdrawAmount = input.nextLine();
        System.out.println("Initial balance :"+atm.getBalance());
        try {
            double amount = Double.parseDouble(withdrawAmount);
            atm.withDraw(amount);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input please enter numbers!");
        }


        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }




    }
}