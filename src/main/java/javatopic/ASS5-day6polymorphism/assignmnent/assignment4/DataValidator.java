package javatopic.day6polymorphism.assignmnent.assignment4;

public interface DataValidator {
   //In interfaces, methods are implicitly abstract (unless they're static, default)
   //Static and default methods must have implementations


    static boolean isNotEmpty(String input){
        return input != "null" && !input.isEmpty();

    // this method is static so we can use function declaration is allowed
    // no obj creation needed for static method





    }

    boolean isValid(String input);
}
