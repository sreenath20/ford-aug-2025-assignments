package javatopic.day6polymorphism.assignmnent.assignment4;

public class EmailValidator implements DataValidator{

    @Override
    public boolean isValid(String input) {
        if(input.length()<6){
            return true;
        }
        else{
            return false;
        }
    }
}
