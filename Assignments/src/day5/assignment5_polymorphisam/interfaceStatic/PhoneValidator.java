package day5.assignment5_polymorphisam.interfaceStatic;

public class PhoneValidator implements DataValidator {
    @Override
    public boolean isValid(String input) {
        return DataValidator.isNotEmpty(input) && input.matches("\\d{10}");//min 10

    }

}
