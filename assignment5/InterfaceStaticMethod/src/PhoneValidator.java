public class PhoneValidator implements DataValidator{
    @Override
    public boolean isValid(String input) {
        if (!DataValidator.isNotEmpty(input)) {
            return false;
        }
        return input.matches("\\d{10}");
    }
}
