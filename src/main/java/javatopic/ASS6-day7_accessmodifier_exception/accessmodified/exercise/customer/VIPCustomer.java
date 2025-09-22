package javatopic.day7_accessmodifier_exception.accessmodified.exercise.customer;
import javatopic.day7_accessmodifier_exception.accessmodified.exercise.bank.Bank;

public class VIPCustomer extends Bank{


    private String user;

    public VIPCustomer(String user) {
        this.user = user;
    }
    public String display(){
        return super.headOfficeLocation;

    }

}
