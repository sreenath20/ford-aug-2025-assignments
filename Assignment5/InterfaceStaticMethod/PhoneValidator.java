package Assignment5.InterfaceStaticMethod;

public class PhoneValidator implements DataValidator {
    @Override
    public boolean isValid(String input) {
        return input.matches("\\d{10}"); // Only 10 digits
    }
}

