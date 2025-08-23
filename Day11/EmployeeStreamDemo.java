import java.util.*;
import static java.util.stream.Collectors.*;

public class EmployeeStreamDemo {
    static class Employee {
        private final int id;
        private final String name;
        private final String department;
        private final double salary;
        private final int experience;

        public Employee(int id, String name, String department, double salary, int experience) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
            this.experience = experience;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public String getDepartment() { return department; }
        public double getSalary() { return salary; }
        public int getExperience() { return experience; }

        @Override
        public String toString() {
            return String.format("Employee{id=%d, name='%s', dept='%s', salary=%.2f, exp=%d}",
                    id, name, department, salary, experience);
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice",   "IT",  72000, 6),
                new Employee(2, "Bob",     "HR",  48000, 12),
                new Employee(3, "Charlie", "IT",  51000, 3),
                new Employee(4, "Diana",   "Finance", 95000, 10),
                new Employee(5, "Ethan",   "HR",  52000, 8),
                new Employee(6, "Fay",     "IT", 120000, 15),
                new Employee(7, "Grace",   "Finance", 45000, 2),
                new Employee(8, "Hector",  "IT",  47000, 11)
        );

        // 1) Filter Employees by Department ("IT")
        List<Employee> itEmployees = employees.stream()
                .filter(e -> "IT".equalsIgnoreCase(e.getDepartment()))
                .collect(toList());
        System.out.println("IT employees:");
        itEmployees.forEach(System.out::println);
        System.out.println();

        // 2) salary > 50,000
        List<Employee> highEarners = employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .collect(toList());
        System.out.println("High earners (salary > 50,000):");
        highEarners.forEach(System.out::println);
        System.out.println();

        // 3) Sort Employees by Salary (descending)
        List<Employee> sortedBySalaryDesc = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(toList());
        System.out.println("Employees sorted by salary (desc):");
        sortedBySalaryDesc.forEach(System.out::println);
        System.out.println();

        // 4) Find Employee Names Only
        List<String> names = employees.stream()
                .map(Employee::getName)
                .collect(toList());
        System.out.println("Employee names:");
        names.forEach(System.out::println);
        System.out.println();

        // 5) Find the Highest Paid Employee
        Optional<Employee> highestPaid = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Highest paid employee:");
        highestPaid.ifPresent(System.out::println);
        System.out.println();

        // 6) Average Salary in Each Department
        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(groupingBy(Employee::getDepartment, averagingDouble(Employee::getSalary)));
        System.out.println("Average salary by department:");
        avgSalaryByDept.forEach((dept, avg) -> System.out.printf("%s -> %.2f%n", dept, avg));
        System.out.println();

        // 7) Check if Any Employee Has More Than 10 Years of Experience
        boolean anyMoreThan10Years = employees.stream()
                .anyMatch(e -> e.getExperience() > 10);
        System.out.println("Any employee with more than 10 years' experience? " + anyMoreThan10Years);
        System.out.println();

        // 8) Count Employees in HR Department
        long hrCount = employees.stream()
                .filter(e -> "HR".equalsIgnoreCase(e.getDepartment()))
                .count();
        System.out.println("Number of employees in HR: " + hrCount);
    }
}
