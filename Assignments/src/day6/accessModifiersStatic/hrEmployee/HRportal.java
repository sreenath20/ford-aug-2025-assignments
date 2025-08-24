package day6.accessModifiersStatic.hrEmployee;

public class HRportal {
    public void showEmployeeInfo(Employee e){
        System.out.println("Employee Name: "+e.name);
        System.out.println("Employee ID: "+e.employeeId);
        System.out.println("Department: "+e.department);
    }
}
