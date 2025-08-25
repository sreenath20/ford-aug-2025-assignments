package assignment_04.banking_system_loan_processing;

public abstract class Loan {
    protected String loanType;

    public Loan(String loanType){
        this.loanType = loanType;
    }

    public String getLoanType(){
        return loanType;
    }

    public double calculateEMI(double principal, double rate, int tenureMonths){
        double  monthlyRate= rate/ (100*12);

        if(monthlyRate==0){
            return principal/tenureMonths;
        }

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, tenureMonths))/(Math.pow(1 + monthlyRate, tenureMonths)-1);
        return emi;
    }
}
