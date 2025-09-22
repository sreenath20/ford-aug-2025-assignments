package javatopic.day12_lambda_streamapi.exercise1;

import java.util.*;


public class Driver {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<Employee>();
        employeeList.add(new Employee(1,"Aany","AAA",53000.0,2));
        employeeList.add(new Employee(2,"Bob","BBB",42000.0,1));
        employeeList.add(new Employee(3,"Zara","AAA",65000.0,2));
        employeeList.add(new Employee(4,"Dany","DDD",11000.0,3));
        employeeList.add(new Employee(5,"Harry","BBB",46000.0,3));
        employeeList.add(new Employee(6,"Fin","AAA",72000.0,7));
        employeeList.add(new Employee(7,"Gamy","DDD",63000.0,5));


        // filter employee by department
        employeeList
                .stream()
                .filter((e) -> e.getDepartment().equals("AAA"))
                .forEach((e)-> System.out.println("filter by salary"+e));

        //find High Earner
        employeeList
                .stream()
                .filter((e) -> e.getSalary()>50000)
                .forEach((e)-> System.out.println("filter by salary greater that 50000"+e));

        // sort by salary
        Comparator<Employee> employeeSalaryComparator=(e1, e2) -> e2.getSalary().compareTo(e1.getSalary());

        List<Employee> sortedList=employeeList
                .stream()
                .sorted(employeeSalaryComparator)
                .toList();
        System.out.println("sorted by salary"+sortedList);

        //employee name

        List<String> employeeName=employeeList
                .stream()
                .map((e)->e.getName())
                .toList();
        System.out.println("name of employee in list"+employeeName);

        //highest paid employee

        Optional<Employee> employeeMaxSalary=employeeList
                .stream()
                .max(Comparator.comparing(Employee::getSalary));
        if(employeeMaxSalary.isPresent()){
            System.out.println("employee max salary is "+employeeMaxSalary.get().getName()+employeeMaxSalary.get().getSalary());
        }


// return true /false if any employee is more than 10 years of experience
        boolean experienceStatus= employeeList
                .stream()
                .anyMatch((e)->e.getExperience()>10);
        System.out.println("experience status greater than 10 yrs is "+experienceStatus);

        // find the no of employee in AAA team

        Long countDepartmentAAA=employeeList
                .stream()
                .filter((e)->e.getDepartment().equals("AAA"))
                .count();
        System.out.println("count departmentAAA is "+countDepartmentAAA);









    }
}
