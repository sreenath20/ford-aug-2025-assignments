package com.ford.bank;



public class Bank {
    public String bankName = "Global Bank";
    private double vaultMoney = 1_000_000;
    String branchCode = "BNK123"; // Default (package-private)
    protected String headOfficeLocation = "New York"; // Protected

    public void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    private void displayVaultMoney() {
        System.out.println("Vault Money: $" + vaultMoney);
    }

    void displayBranchCode() { // Default (package-private)
        System.out.println("Branch Code: " + branchCode);
    }

    protected void displayHeadOfficeLocation() { // Protected
        System.out.println("Head Office: " + headOfficeLocation);
    }

    public void testPrivateAccessInsideBank() {
        System.out.println("\n--- Testing private access within Bank class ---");
        displayVaultMoney(); // Accessible inside its own class
        System.out.println("----------------------------------------------");
    }
}
