package day4.bankLoanSystem;

abstract class Loan {
    double principle;
    double rate;
    int tenureMonths;

    abstract double calculateEMI(double principle,double rate,int tenureMonths);








}
