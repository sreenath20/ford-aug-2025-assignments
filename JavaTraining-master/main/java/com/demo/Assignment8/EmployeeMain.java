package com.demo.Assignment8;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employeesDetail = new ArrayList<>();
        employeesDetail.add(new Employee(1,"John","ET",55000.0));
        employeesDetail.add(new Employee(2,"Ravi","ET",45000.0));
        employeesDetail.add(new Employee(3,"Kumar","ET",65000.0));
        employeesDetail.add(new Employee(4,"kevin","ET",75000.0));
        employeesDetail.add(new Employee(5,"Ram","ET",35000.0));
        System.out.println(employeesDetail);

        //UPDATE EMPLOYEE SALARy

        Double updateSalary=60000.0;
        employeesDetail.get(2).setSalary(updateSalary);
        System.out.println(employeesDetail);
        employeesDetail.remove(2);
        System.out.println(employeesDetail);
        //SEARCHING
        Employee Searchemployee = new Employee(1,"John","ET",55000.0);
        Integer number=(Searchemployee.getId());
       if(employeesDetail.contains(number)){

           System.out.println(number);

       }



    }
}
