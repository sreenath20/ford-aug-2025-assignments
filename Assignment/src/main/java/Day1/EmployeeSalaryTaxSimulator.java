package Day1;

public class EmployeeSalaryTaxSimulator {
    public static void main(String[] args) {

        Double monthlySalary = 0.0;
        Double annualSalary;
        Integer taxSlab;
        Double grossSalary = 96000.98;
        Double deductions = 0.0;
        Double employeeProvidentFund = 7000.24;
        Double healthInsurance = 4000.9;
        Double incomeTax;

        System.out.println("The gross salary is : " + grossSalary);
        System.out.println("Calculating the deductions");
        deductions += employeeProvidentFund + healthInsurance;
        monthlySalary = (grossSalary - deductions);
        System.out.println("The monthly salary is " + monthlySalary);
        annualSalary = monthlySalary * 12;

        System.out.println("The annual salary is " + annualSalary);
        System.out.println("Calculating the income tax");

        if (annualSalary <= 500000) {
            System.out.println("No tax for the annual salary");
        } else if ((annualSalary > 500000) & (annualSalary <= 1000000)) {
            incomeTax = annualSalary * 0.05;
            System.out.println("You fall under income tax slab 1");
            System.out.println("Income tax is " + incomeTax);
        } else if ((annualSalary > 1000000) & (annualSalary <= 1500000)) {
            incomeTax = annualSalary * 0.15;
            System.out.println("You fall under income tax slab 2");
            System.out.println("Income tax is " + incomeTax);
        } else if (annualSalary > 1500000) {
            incomeTax = annualSalary * 0.25;
            System.out.println("You fall under income tax slab 3");
            System.out.println("Income tax is " + incomeTax);
        }


    }
}
