package java_access_modifiers_exercise;



public class Branch {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // public - accessible
        System.out.println(bank.bankName);

        // private - NOT accessible (would not compile)
        // System.out.println(bank.vaultMoney);

        // default (package-private) - accessible because Branch is in same package
        System.out.println(bank.branchCode);

        // protected - accessible in same package
        System.out.println(bank.headOfficeLocation);

        // methods
        bank.displayBankName();          // public
        // bank.displayVaultMoney();     // private - not accessible
        bank.displayBranchCode();        // default
        bank.displayHeadOfficeLocation(); // protected
    }
}
