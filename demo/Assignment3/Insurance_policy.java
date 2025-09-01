package com.demo.Assignment3;
//----------------Assignment 9
public abstract class Insurance_policy {
    public abstract void calculatePremium();
}
class policy{
    private int policy_number;
    private String HolderName;
    private double amount;
    public policy(int policy_number, String HolderName, double amount) {
        this.policy_number = policy_number;
        this.HolderName = HolderName;
        this.amount = amount;
    }
    public int getPolicy_number() {
        return policy_number;
    }
    public String getHolderName() {
        return HolderName;
    }
    public double getAmount() {
        return amount;
    }

}
class LifeInsurance extends policy{
    public String Nominee_Name;
    public int Nominee_phoneNumber;
    public LifeInsurance(int policy_number, String HolderName, double amount,String Nominee_Name,int Nominee_phoneNumber) {
        super(policy_number,HolderName,amount);
        this.Nominee_Name = Nominee_Name;
    this.Nominee_phoneNumber = Nominee_phoneNumber;
    }
    public void display(){
        System.out.println("PolicyNumber"+getPolicy_number()+"HolderName"+getHolderName()+"Amount"+getAmount()+"");

    }
}
class HealthInsurance extends policy{
    public int Hospital_coverage;
    HealthInsurance(int policy_number, String HolderName, double amount,int Hospital_coverage) {
        super(policy_number,HolderName,amount);
        this.Hospital_coverage=Hospital_coverage;

    }
    public void display(){
        System.out.println("PolicyNumber"+getPolicy_number()+"HolderName"+getHolderName()+"Hospital_coverage"+Hospital_coverage);
    }
}
class VehicleInsurance extends policy{
    String vehicleNumber;
    public VehicleInsurance(int policy_number, String HolderName, double amount,String vehicleNumber) {
        super(policy_number,HolderName,amount);
        this.vehicleNumber=vehicleNumber;
    }
    public void display(){
        System.out.println("PolicyNumber"+getPolicy_number()+"HolderName"+getHolderName()+" VehicleNumber: "+vehicleNumber);
    }
}
