import java.util.Scanner;

public class Atmpinvalidation
{
    public static void main(String[] args) {
        int tries = 3;
        String password = "1234";
        Scanner sc = new Scanner(System.in);
        while (tries > 0) {
            System.out.println("Enter Password:");
            String enteredPassword = sc.nextLine();
            if (enteredPassword.equals(password)) {
                System.out.println("Password Correct! Access granted");
                break;
            } else {
                System.out.println("Wrong Password! pease try again!");
                System.out.println("your remaining tries: " + (tries - 1));
                tries -= 1;
            }
        }
        if (tries == 0) {
            System.out.println("you used all your attempts! data inside it is going to destroy");
        }
    }
}
