package java_access_modifiers_exercise;





public class CustomerService {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // public - accessible
        System.out.println(bank.bankName);

        // default/package-private - NOT accessible from different package
        // System.out.println(bank.branchCode);

        // private - NOT accessible
        // System.out.println(bank.vaultMoney);

        // protected - NOT accessible here because this class is not a subclass (and is in different package)
        // System.out.println(bank.headOfficeLocation);

        // methods
        bank.displayBankName(); // public
        // bank.displayBranchCode(); // default - not accessible
        // bank.displayHeadOfficeLocation(); // protected - not accessible here

        // But because Bank exposes a public getter, we can access vaultMoney via that method:
        System.out.println("Vault via getter (allowed): $" + bank.getVaultMoney());
    }
}
