package day7.Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter the pin: ");
            String pin = sc.nextLine();
            atm.validatePin(pin);
        }catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
        catch (InvalidPinException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("End of the program");
        }
    }
}
