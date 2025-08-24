package day5.assignment5_polymorphisam.interfaceStatic;



public class EmailValidator implements DataValidator {
    @Override
    public boolean isValid(String input) {
        return DataValidator.isNotEmpty(input) && input.contains("@");
    }




}
