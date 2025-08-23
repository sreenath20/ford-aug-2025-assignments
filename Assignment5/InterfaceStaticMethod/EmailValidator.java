package Assignment5.InterfaceStaticMethod;



public class EmailValidator implements DataValidator {
    @Override
    public boolean isValid(String input) {
        return input.contains("@") && input.endsWith(".com");
    }
}

