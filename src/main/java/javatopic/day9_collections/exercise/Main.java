package javatopic.day9_collections.exercise;

//Exercise : Create List of employees and do below operations:
// 1) CRUD operations,
// 2) Sort employee list by id/name/salary,
// 3) Search for given Employee in list

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //CRUD
        //CREATE

        List<Employee> employeelist = new ArrayList<Employee>();
        employeelist.add(new Employee(1,"abc",50000.0));
        employeelist.add(new Employee(2,"def",55000.0));
        employeelist.add(new Employee(3,"ghi",56000.0));
        System.out.println(employeelist);


        //READ
        System.out.println(employeelist.get(2));

        //UPDATE
        // here you can add new product but can update the existing list
        // error i have got IndexOutOfBoundsException: Index 3 out of bounds for length 3
        // when index is set to 3

        employeelist.set(2,new Employee(4,"jkl",57000.0));
        // set return the element previously at the specified position
        System.out.println(employeelist);
        System.out.println(employeelist.get(2));

        Employee updateEmployee = new Employee(11,"abc",50000.0);
        employeelist.set(0,updateEmployee);

        //DELETE
        employeelist.remove(1);
        System.out.println(employeelist);

        employeelist.remove(updateEmployee);
        System.out.println(employeelist);
        employeelist.clear();
        // delete all employye;
        System.out.println(employeelist);


        employeelist.add(new Employee(11,"abc",60000.0));
        employeelist.add(new Employee(20,"def",45000.0));
        employeelist.add(new Employee(3,"ghi",56000.0));


        System.out.println(employeelist);
        System.out.println("sort employees by employee List");
        Collections.sort(employeelist);

        System.out.println(employeelist);



        // sort by id
        System.out.println("sort employees by employee id");
        employeelist.sort(new EmployeeIdComparator());

        System.out.println(employeelist);

        //sort by name
        System.out.println("sort employees by employee name");
        employeelist.sort(new EmployeeNameComparator());
        System.out.println(employeelist);

        //sort by salary
        System.out.println("sort employees by employee salary");
        employeelist.sort(new EmployeeSalaryComparator());
        System.out.println(employeelist);



        //using collection and sorting employee by name

        Collections.sort(employeelist,new EmployeeNameComparator());
        System.out.println("name sort using collection"+employeelist);

      // searching

        Employee searchEmployee=new Employee(11,"abc",50000.0);
        System.out.println(employeelist.indexOf(searchEmployee));
        System.out.println(employeelist.contains(searchEmployee));


        // check equality
        Employee employee1=new Employee(12,"abcd",50000.0);
        Employee employee2=employee1;

        if(employee1.equals(employee2)){
            System.out.println("equals");
        }
        else{
            System.out.println("not equals");
        }
    }

}
