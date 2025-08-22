package javatopic.day8_custom_exception.assignment.assignment1_atm_pin_validation;

import java.util.Scanner;
//checked exception
// here the compiler indicate the error if the function that will throw error is not handled in try catch
// another method to handle the redline(error) under function is declare main throws the custom exception it will not show  the error
// by saying I acknowledge this method might throw InvalidPinException, but I'm NOT handling it here. I'm passing this responsibility to whoever calls this method."
public class Main {
    public static void main(String[] args) throws InvalidPinException  {
        Scanner input = new Scanner(System.in);
        String pinNumber;
        boolean validate=false;
        System.out.println("Enter pin number:");
        pinNumber=input.nextLine();
        ATM atm=new ATM();
       // try{
            validate=atm.validatePin(pinNumber);
            System.out.println("end of try block");
        //}
        //catch(InvalidPinException e){  // here (InvalidException e throw new InValidPinException)
          //  System.out.println(e.getMessage());
            System.out.println("end of catch block");
        //}
        System.out.println("end of application");

        if(validate){
            System.out.println("correct pin");
        }
        else{
            System.out.println("invalid pin");
        }
    }
}
