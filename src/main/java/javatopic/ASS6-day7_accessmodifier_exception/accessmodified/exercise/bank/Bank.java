package javatopic.day7_accessmodifier_exception.accessmodified.exercise.bank;

public class Bank {
    public String bankName="Global Bank";
    private double vaultMoney=1_000_000;
    String branchCode = "BNK123";
    protected String headOfficeLocation="New York";

    public void displayBankName(){
        System.out.println("BankName:"+bankName);
    }

    private void displayVaultMoney(){
        System.out.println("VaultMoney:"+vaultMoney);
    }

    void displayBranchCode(){
        System.out.println("BranchCode:"+branchCode);
    }
    protected void displayHeadOfficeLocation(){
        System.out.println("HeadOfficeLocation:"+headOfficeLocation);
    }

    public void testPrivateAccessInsideBank(){
        displayVaultMoney();
    }
}
