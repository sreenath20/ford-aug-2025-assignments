package com.fullstackab.OOPS.Day7.bank;

public class Bank {

    public String bankName = "Global Bank";
    private double vaultMoney = 1_000_000;
    String branchCode = "BNK123";
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

    public void testPrivateAccessInsideBank() {
        displayVaultMoney();
    }
}

