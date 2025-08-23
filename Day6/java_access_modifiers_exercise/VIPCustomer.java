package java_access_modifiers_exercise;



public class VIPCustomer extends Bank {
    public static void main(String[] args) {
        VIPCustomer vip = new VIPCustomer();

        // public - accessible
        System.out.println(vip.bankName);

        // default/package-private - NOT accessible (different package, even though subclass)
        // System.out.println(vip.branchCode);

        // private - NOT accessible
        // System.out.println(vip.vaultMoney);

        // protected - accessible because VIPCustomer is a subclass (accessed through subclass reference)
        System.out.println(vip.headOfficeLocation);

        // methods
        vip.displayBankName();           // public
        vip.displayHeadOfficeLocation(); // protected

        // Important nuance:
        // Bank b = new VIPCustomer();
        // System.out.println(b.headOfficeLocation); // <-- This does NOT compile when written in a class outside `bank`.
        // In a subclass, accessing protected via the subclass instance (vip) is allowed.
    }
}
