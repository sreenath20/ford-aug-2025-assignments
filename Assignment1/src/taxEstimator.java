import java.util.Scanner;

public class taxEstimator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the monthly salary: ");
        Double monthlySalary= sc.nextDouble();
        Double taxPercentage;
        if(monthlySalary>0 && monthlySalary<=20000){
            taxPercentage=0.0;
        }
        else if(monthlySalary<=40000){
            taxPercentage=5.0;
        } else if (monthlySalary <= 83333) {
            taxPercentage=10.0;
        }
        else if(monthlySalary>83333){
            taxPercentage=20.0;
        }else{
            taxPercentage=0.0;
        }

        Double netAnnualSalary=monthlySalary * 12;
        Double AnnualTaxAmount=(taxPercentage/100)*netAnnualSalary;
        netAnnualSalary-=AnnualTaxAmount;
        System.out.printf("Annual Tax Amount: ₹%.2f%n", AnnualTaxAmount);
        System.out.printf("Annual Salary after tax: ₹%.2f%n", netAnnualSalary);
        System.out.printf("Annual Salary before tax: ₹%.2f%n", netAnnualSalary + AnnualTaxAmount);
        System.out.printf("Tax Rate: %.0f%%%n", taxPercentage);





    }
}
