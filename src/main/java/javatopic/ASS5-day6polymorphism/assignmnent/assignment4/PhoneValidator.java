package javatopic.day6polymorphism.assignmnent.assignment4;

public class PhoneValidator implements DataValidator{

    @Override
    public boolean isValid(String input) {
        if(input.length()<10){
            return false;
        }
        else{
            return true;
        }
    }

}
