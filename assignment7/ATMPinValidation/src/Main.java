import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InvalidPinException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PIN number: ");
        String pin = sc.nextLine();

        ATM atm = new ATM();
        try {
            int pinNumber = Integer.parseInt(pin);
            atm.validatePin(pinNumber);
        } catch (NumberFormatException e) {
            System.out.println("enter numeric value");
        } catch (InvalidPinException e) {
            System.out.println(e.getMessage());
        }

    }
}