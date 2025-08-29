//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Policy lifeInsurance=new LifeInsurance(7382333,"TRix",198888,"john");
        Policy healthInsurance=new HealthInsurance(3434222,"govind",40000,false);
        Policy vehicleInsurance = new VehicleInsurance(8888,"pops",99999,"suzuki");
        lifeInsurance.displayInsuranceDetails();
        healthInsurance.displayInsuranceDetails();
        vehicleInsurance.displayInsuranceDetails();
        
    }
}