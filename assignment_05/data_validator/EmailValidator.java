package assignment_05.data_validator;

public class EmailValidator implements DataValidator {
    @Override
    public boolean isValid(String input) {
        if (DataValidator.isNotEmpty(input)) {
            if (input.contains("@") && input.contains(".")) {
                return true;
            }
        }
        return false;
    }
}
