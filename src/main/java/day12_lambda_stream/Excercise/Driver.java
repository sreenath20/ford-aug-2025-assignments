

package day12_lambda_stream.Excercise;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Driver {
    public static void main(String[] args) {
        Consumer<Employee> employeeConsumer = (e) -> System.out.println(e);
        Employee employee = new Employee(1001, "aaa", (double)5000.0F);
        employeeConsumer.accept(employee);
        Supplier<Employee> employeeSupplier = () -> new Employee(1002, "bbb", (double)6000.0F);
        Employee newEmployee = (Employee)employeeSupplier.get();
        System.out.println(newEmployee);
        Predicate<Employee> employeePredicate = (e) -> e.getId() == 1001;
        boolean isId1001 = employeePredicate.test(employee);
        System.out.println("Is employee ID 1001? " + isId1001);
        Function<Employee, Employee> employeeFunction = (e) -> {
            Double salary = e.getSalary() * 1.1;
            e.setSalary(e.getSalary() * 1.1);
            return e;
        };
        Employee employee1 = (Employee)employeeFunction.apply(employee);
        System.out.println("Updated Salary: " + String.valueOf(employee1));
        Employee employeeobj = new Employee(7, "chennai", (double)70000.0F);
        PrintStream var10000 = System.out;
        Object var10001 = employeeFunction.apply(employeeobj);
        var10000.println("employee details of id  7 " + String.valueOf(var10001));
        System.out.println("employee details of id  7 " + String.valueOf(employeeobj));
        display(employeeSupplier);
        processEmployeeSalary(employeeFunction);
        System.out.println(employee);
        System.out.println(employeeobj);
        List<Employee> employeelist = new ArrayList();
        employeelist.add(new Employee(1, "dda", (double)46000.0F));
        employeelist.add(new Employee(2, "bbb", (double)60000.0F));
        employeelist.add(new Employee(3, "ccc", (double)30000.0F));
        employeelist.stream().filter((e) -> e.getSalary() > (double)60000.0F).forEach((e) -> System.out.println(e));
        Long count = employeelist.stream().filter((e) -> e.getSalary() > (double)60000.0F).count();
        System.out.println("Count of employees with salary > 60000: " + count);
        Comparator<Employee> EmployeenameComparator = (e1, e2) -> e1.getName().compareTo(e2.getName());
        List<Employee> sortedEmployees = employeelist.stream().sorted(EmployeenameComparator).toList();
        System.out.println("Sorted emp by name:" + String.valueOf(sortedEmployees));
        System.out.println("After sorting emp collection remains same:" + String.valueOf(employeelist));
        System.out.println();
        List<Employee> employeelistwithhike = employeelist.stream().map((e) -> {
            Double salary = e.getSalary() * 1.1;
            return new Employee(e.getId(), e.getName(), salary);
        }).sorted().toList();
        Double totalsalary = employeelistwithhike.stream().mapToDouble((e) -> e.getSalary()).sum();
        System.out.println("Total salary of employees with hike: " + totalsalary);
        totalsalary = employeelist.stream().mapToDouble((e) -> {
            Double salary = e.getSalary() * 1.1;
            return salary;
        }).sum();
        System.out.println("Total salary of employees with hike: " + totalsalary);
        System.out.println("Employees list  with salary hike: " + String.valueOf(employeelistwithhike));
        System.out.println("Original list" + String.valueOf(employeelist));
    }

    static void display(Supplier<Employee> employeeSupplier) {
        System.out.println(employeeSupplier.get());
    }

    static void processEmployeeSalary(Function<Employee, Employee> employeeFunction) {
        System.out.println(employeeFunction.apply(new Employee(7, "chennai", (double)70000.0F)));
    }
}
