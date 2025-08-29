package hr;

public class HRPortal {
    public void accessEmployeeData(){
        Employee emp = new Employee(25000.0, 1116233,"PDPO", "Trixie");
        System.out.println("employee ID: " + emp.employeeID);
//      System.out.println("salary: " + emp.Salary());
        System.out.println("here we cannot access directly emp.salary instead we can use getSalary() method to retrive the salary value");
        System.out.println("salary: "+emp.getSalary());
        System.out.println("department: " + emp.department);
        System.out.println("name: " + emp.name);
    }
}
