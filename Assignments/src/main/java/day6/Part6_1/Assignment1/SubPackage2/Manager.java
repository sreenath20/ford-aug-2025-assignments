package day6.Part6_1.Assignment1.SubPackage2;

import day6.Part6_1.Assignment1.Employee;

  public class Manager extends Employee {
        public Manager(double salary, int id, String dept, String name) {
            super(salary, id, dept, name);
        }
        public void generateReport() {
            System.out.println("Manager accessing department: " + department);
            // System.out.println(employeeId); default - not accessible outside package

        }
}
