public class ATM {
    private double balance=10000.0;

    public void withDraw(double amount){
        if(amount > balance){
           throw new ArithmeticException("Error: Insufficient Balance");
        }
        else if(amount <=0 ){
            throw new IllegalArgumentException("Enter valid Amount");

        }
        else{
            balance -= amount;
            System.out.println("Withdraw Success");
            System.out.println("new balance is "+balance);
        }
    }
    public double getBalance(){
        return balance;
    }
}
