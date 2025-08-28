package day7.Assignment1;

public class Atm {
    public final String pin = "1234";
    public void validatePin(String pin)  throws InvalidPinException {
        if(pin.length()!=4){
            throw new InvalidPinException("Error: Pin must be 4 digits");
        }else if (!pin.equals(this.pin)){
            throw new InvalidPinException("Error: Incorrect pin");
        }
        else{
            System.out.println("Access Granted. Welcome!!");
        }
    }
}
