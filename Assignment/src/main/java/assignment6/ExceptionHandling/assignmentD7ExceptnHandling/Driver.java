package assignment6.ExceptionHandling.assignmentD7ExceptnHandling;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args)  {
        ATM atm = new ATM();
        atm.balance = 500;
        Scanner scanner = new Scanner(System.in);
        String inputamount= scanner.next();

        try{
           double amount = Double.parseDouble(inputamount);
           atm.Withdraw(amount);
            }

        catch(ArithmeticExceptions e){
            throw new RuntimeException(e);
        }
        catch(assignmentD7ExceptnHandling.IllegalArgumentException e)
        {
            throw new RuntimeException(e);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid amount entered");
      //      System.out.println(e.getMessage());
        }
        finally {
            System.out.println("The available balance is");
        }
        }
    }

