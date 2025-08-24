package assignment5.assignment5Polymorphism;

public interface DataValidator {

     public static boolean isNotEmpty(String input){
            if (input != null && input.length()>0 ) {
//                return true;
                System.out.println("Input is valid");
         }
            else {
                System.out.println("Input is empty");

            }
         return false;
     }
        abstract void isValid(String input) ;
}
