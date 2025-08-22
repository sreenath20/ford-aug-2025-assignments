package javatopic.day6polymorphism.assignmnent.assignment6;

public class BankAccount implements SecurityCheck {
    String userName="Nisha";
    String password="nisha123";
    String accountType;
    Double balance;

    public BankAccount() {

    }

    public BankAccount(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public BankAccount( String accountType, Double balance) {

        this.accountType = accountType;
        this.balance = balance;
    }

    void calculateInterest(){
        System.out.println("Interest calculation for your:"+accountType);
}
//
   // if public not assigned here then error:attempting to assign weaker access privileges ('package-private'); was 'public'
public boolean verifyUser(String userName,String password) {
    if(userName.equals(this.userName) && password.equals(this.password)){
        System.out.println("User "+userName+" has been successfully verified");
        return true;
    }
    else{
        System.out.println("User "+userName+" entered wrong password please check username & password");
        return false;
    }

}
}
