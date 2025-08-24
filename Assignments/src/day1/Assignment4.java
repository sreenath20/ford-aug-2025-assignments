package day1;

public class Assignment4 {
    public static void main(String[] args) {
        double monthlySalary = 100000;
        double annualSalary = monthlySalary * 12;
        double tax=0;
        double netSalary=annualSalary;
        if (annualSalary > 600000.00) {
            tax=(annualSalary*(0.12));
            netSalary-=tax;
        }
        System.out.println("Annual net salary: "+netSalary);
        System.out.println("Monthly net salary: "+(netSalary)/12);
    }
}
