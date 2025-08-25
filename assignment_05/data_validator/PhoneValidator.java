package assignment_05.data_validator;

public class PhoneValidator implements DataValidator {
    @Override
    public boolean isValid(String input) {
        if (DataValidator.isNotEmpty(input)) {
            String cleanPhone = input.replace(" ", "").replace("-", "");
            if (cleanPhone.length() >= 10 && cleanPhone.matches("[0-9]+")) {
                return true;
            }
        }
        return false;
    }
}
