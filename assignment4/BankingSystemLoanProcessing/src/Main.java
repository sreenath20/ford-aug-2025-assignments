public class Main {
    public static void main(String[] args) {
        HomeLoan hl = new HomeLoan();
        double emi = hl.CalculateEmi(50000, 7.5, 60); // principal, rate, tenure
        System.out.println("Home loan EMI: $" + Math.round(emi) + "/month");
        hl.approveLoan();
        System.out.println("------------------------");
        CarLoan car = new CarLoan();
        double emi1=car.CalculateEmi(20000, 9, 48);
        System.out.println("car loan "+Math.round(emi1)+"/month");
        car.approveLoan();
    }
}
