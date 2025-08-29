public interface DataValidator {
    static boolean isNotEmpty(String input) {
        return input != null && !input.isEmpty();
    }

    abstract boolean isValid(String input);


}
