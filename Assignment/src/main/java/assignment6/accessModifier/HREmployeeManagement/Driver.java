package assignment6.accessModifier.HREmployeeManagement;

public class Driver {
    public static void main(String[] args) {
        Employee employee = new Employee();
        HRPortal hrPortal = new HRPortal();
        employee.employeeID = 2345;
        employee.department = "Engineering";
        //employee.salary = 7888.98;
        hrPortal.display();

//Hospital App

       Patient patient = new Patient("Cold",2256,"ABJ876","Yoshina");
//
//        Patient patient = new Patient();
//         patient.name = "test";

        Reception reception = new Reception();
        reception.Receptiondisplay(patient);
    //        reception.display("fever",8765,"HHUU89","kazhama");

    }
}
