package javatopic.day8_custom_exception.assignment.assignment1_atm_pin_validation;

public class ATM {
    String storedPinValue="2143";
    boolean storedPinValid=false;
    boolean validatePin(String enteredPin) throws InvalidPinException {
        if(enteredPin.length()!=4)
        {
            throw new InvalidPinException("enteredPin is invalid,Pin number should be 4 digits");
            //System.out.println("this is unreachable"); after throw its unreachable
        }
        else if(!enteredPin.equals("2143")){
            throw new InvalidPinException("enteredPin is incorrect,please check the pin number");
        }
        else{
            return true;
        }
    }
}
