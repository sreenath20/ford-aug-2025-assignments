package Assignment5.InterfaceStaticMethod;

public interface DataValidator {
    static boolean isNotEmpty(String input) {
        return input != null && !input.trim().isEmpty();
    }

    boolean isValid(String input);
}
