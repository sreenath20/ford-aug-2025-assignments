package day5.Assignment4;

public class EmailValidator implements DataValidator {
    @Override
    public boolean isValid(String input) {
        if(input.contains("@") && input.contains(".com")) {
            return true;
        }
        else{
            return false;
        }
    }
}
