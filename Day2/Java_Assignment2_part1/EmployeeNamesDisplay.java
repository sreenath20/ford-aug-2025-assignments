

public class EmployeeNamesDisplay {
    public static void main(String[] args) {
        String[] employees = {
                "Alice Johnson",
                "Bob Smith",
                "Charlie Davis",
                "Diana Lee",
                "Ethan Patel"
        };

        System.out.println("Employee list:");
        for (String name : employees) {
            System.out.println("- " + name);
        }
    }
}
