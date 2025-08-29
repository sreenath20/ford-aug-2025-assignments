public class ATM {
    protected final int pin=1234;

    public void validatePin(int enteredPin) throws InvalidPinException {
        if (enteredPin >999 && enteredPin <=9999) {
            if(enteredPin==this.pin) {
                System.out.println("Access Granted");
            }
            else {
                throw new InvalidPinException("enterend pin is incorrect");
            }
        }
        else {
            throw new InvalidPinException("Enter 4 digit valid pin.");
        }
    }

}
