package day6.exceptionHandling;

public class Banking {
    private double balance;

    public Banking(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void withdraw(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Amount must be greater than 0.");
        }
        if(amount > balance){
            throw new IllegalArgumentException("Amount must be less than or equal to balance.");
        }
        balance-=amount;
    }
}
