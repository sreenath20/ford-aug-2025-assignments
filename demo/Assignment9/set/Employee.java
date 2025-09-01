package com.demo.Assignment9.set;

import com.demo.Assignment9.Course;

import java.util.*;

public class Employee {
    public static void main(String args[]) {
        Set<EmployeeDetails> setEmployee = new HashSet<>();
        setEmployee.add(new EmployeeDetails(1,"rejish","ET"));
        setEmployee.add(new EmployeeDetails(3,"karan","ET"));
        setEmployee.add(new EmployeeDetails(22,"krishna","Finance"));
        setEmployee.add(new EmployeeDetails(4,"jayanth","Supply chain"));
        setEmployee.add(new EmployeeDetails(5,"keran","IT"));
        System.out.println(setEmployee);
        System.out.println("to remove");
        for(EmployeeDetails e:setEmployee){
            if(e.getEmployeeId().equals(22)){
                setEmployee.remove(e);

            }
            if(e.getEmployeeId().equals(4)){
                e.setEmployeeDepartment("civil");
            }
        }
        System.out.println(setEmployee);

        //searching

       if(setEmployee.contains(new EmployeeDetails(1,"karuna","research"))){
           System.out.println("Found the employee");
       }

       // to print the employee of same department

       for(EmployeeDetails e:setEmployee){
           if(e.getEmployeeDepartment().equals("ET")){
               System.out.println(e.getEmployeeId());
           }
       }
       List<EmployeeDetails> listEmployee = new ArrayList<>(setEmployee);
         //sort by name
       listEmployee.sort(new ComparatorByName());
        System.out.println(listEmployee);

        // sort by id
       listEmployee.sort(new ComparatorById());
        System.out.println(listEmployee);

    }
}
