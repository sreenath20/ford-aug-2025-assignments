package java_access_modifiers_exercise;



public class Bank {
    public String bankName = "Global Bank";
    private double vaultMoney = 1_000_000;
    String branchCode = "BNK123"; // default / package-private
    protected String headOfficeLocation = "New York";

    public void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    private void displayVaultMoney() {
        System.out.println("Vault Money: $" + vaultMoney);
    }

    void displayBranchCode() {
        System.out.println("Branch Code: " + branchCode);
    }

    protected void displayHeadOfficeLocation() {
        System.out.println("Head Office: " + headOfficeLocation);
    }

    // public method inside Bank that calls a private method (allowed)
    public void testPrivateAccessInsideBank() {
        displayVaultMoney();
    }

    // Optional safe accessor (public getter) to demonstrate controlled access to private
    public double getVaultMoney() {
        return vaultMoney;
    }
}
