package day5.assignment5_polymorphisam.interfaceStatic;

public interface DataValidator {
    static boolean isNotEmpty(String input) {
        return input != null && !input.isEmpty();
    }
    boolean isValid(String input);
}
