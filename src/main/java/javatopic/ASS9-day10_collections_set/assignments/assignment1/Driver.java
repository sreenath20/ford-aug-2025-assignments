package javatopic.day10_collections_set.assignments.assignment1;

import java.util.*;

public class Driver {

    public static void main(String args[]){
        //CRUD OPERATION

        //CREATE
        //Hashset creation

        Set<Employee> employeeSet=new HashSet<>();
        employeeSet.add(new Employee(111,"Raghul","IT"));
        employeeSet.add(new Employee(222,"Sam","FINANCE"));
        employeeSet.add(new Employee(333,"Alen","MANUFACTURING"));
        employeeSet.add(new Employee(444,"Mary","MARKETING"));
        employeeSet.add(new Employee(555,"Zara","IT"));
        employeeSet.add(new Employee(666,"Samy","IT"));
        employeeSet.add(new Employee(777,"Blessy","FINANCE"));
        employeeSet.add(new Employee(888,"Rio","MARKETING"));
        employeeSet.add(new Employee(999,"Gamy","MANUFACTURING"));
        System.out.println("The set creation after adding elements");
        System.out.println(employeeSet);
        System.out.println("-----------------------------------------------------------------------------------------------------------");

        //REMOVE
        for(Employee employee:employeeSet){
            if(employee.getId().equals(333)){
                System.out.println("employee with id 33 is removed :"+employeeSet.remove(employee));
                break;// if break not given then error

            }
        }

        System.out.println("after removing the employee with id=333 then the set looks like");
        System.out.println(employeeSet);
        System.out.println("-----------------------------------------------------------------------------------------------------------");

        //UPDATE
        for(Employee employee:employeeSet){
            if(employee.getId().equals(444)){

                employee.setDepartment("FINANCE");
                break;
            }
        }
        System.out.println("updating employee's department");
        System.out.println(employeeSet);
        System.out.println("-----------------------------------------------------------------------------------------------------------");
       


        //SEARCHING
        System.out.println("searching an employee with id=444");
        for(Employee employee:employeeSet){
            if(employee.getId().equals(444)){
                System.out.println(employee);
                break;

            }
        }
        System.out.println("display all employee in IT");
        for(Employee employee:employeeSet){
            if(employee.getDepartment().equals("IT")){
                System.out.println(employee);
            }
        }


        //SORTING

        // do not have sort method to sort a set
        // how to do sorting for set?
        // so convert set into list and then sort
        //why this? --> // HashSet<Employee> referenceObj =(HashSet<Employee>) employeeSet downcasting
        //--------------------------------


        //sort by name
        System.out.println("sorting");
        List<Employee> employeeList=new ArrayList<>(employeeSet);
        System.out.println("sorted by name");
        employeeList.sort(new EmployeeNameComparator());
        System.out.println(employeeList);
        System.out.println("-----------------------------------------------------------------------");
        employeeList.sort(new EmployeeDepartmentComparator());
        System.out.println("sorted by department");
        System.out.println(employeeList);
        System.out.println("--------------------------------------------------------------------------------");
        employeeList.sort(new EmployeeIdComparator());
        System.out.println("sorted by id");
        System.out.println(employeeList);


        //Suppose if we use TreeSet how can we implement all three 3 diiferent sorting in that







    }
}
