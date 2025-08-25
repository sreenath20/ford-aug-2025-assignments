package assignment_05.data_validator;

public interface DataValidator {
    static boolean isNotEmpty(String input) {
        if (input != null && !input.trim().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    boolean isValid(String input);
}
