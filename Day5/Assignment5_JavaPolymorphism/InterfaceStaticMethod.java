public class InterfaceStaticMethod {

    interface DataValidator {
        static boolean isNotEmpty(String input) {
            return input != null && !input.trim().isEmpty();
        }

        boolean isValid(String input);
    }

    static class EmailValidator implements DataValidator {
        @Override
        public boolean isValid(String input) {
            if (!DataValidator.isNotEmpty(input)) return false;
            return input.contains("@") && input.contains(".");
        }
    }

    static class PhoneValidator implements DataValidator {
        @Override
        public boolean isValid(String input) {
            if (!DataValidator.isNotEmpty(input)) return false;
            String digits = input.replaceAll("\\D", "");
            return digits.length() >= 7 && digits.length() <= 15;
        }
    }

    public static void main(String[] args) {
        System.out.println("isNotEmpty(null): " + DataValidator.isNotEmpty(null));
        System.out.println("isNotEmpty(\"\"): " + DataValidator.isNotEmpty(""));

        DataValidator emailVal = new EmailValidator();
        DataValidator phoneVal = new PhoneValidator();

        System.out.println("emailVal.isValid(\"alice@example.com\"): " + emailVal.isValid("alice@example.com"));
        System.out.println("phoneVal.isValid(\"+1-555-123-4567\"): " + phoneVal.isValid("+1-555-123-4567"));

    }
}
