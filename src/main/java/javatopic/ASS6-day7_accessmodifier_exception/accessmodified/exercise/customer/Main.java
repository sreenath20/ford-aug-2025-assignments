package javatopic.day7_accessmodifier_exception.accessmodified.exercise.customer;

public class Main {
    public static void main(String[] args) {
        VIPCustomer vip = new VIPCustomer("user1");
        System.out.println(vip.bankName);
        // System.out.println(vip.branchCode);
        // System.out.println(vip.vaultMoney);
       // System.out.println(vip.headOfficeLocation);
        // here the vip.headOfficeLocation is protected but still the child obj is not accessable bcz it is access within the child class to get access here we have to use getter and setter now lets try


        vip.displayBankName();
        System.out.println(vip.display());

      //  vip.displayHeadOfficeLocation(); protected access

        // vip.displayBranchCode();


        System.out.println(vip.display()); // here indirect access of the protected field member is done through child class
    }
}
