let employees = [
        { id: 1, name: "Ravi", salary: 30000 },
        { id: 2, name: "Neha", salary: 45000 },
        { id: 3, name: "Ajay", salary: 25000 }
    ];

// Calculate total payroll (sum of salaries).
    let totalPayroll = employees.reduce((total, emp) => total + emp.salary, 0);
    console.log("Total Payroll: ", totalPayroll);

// Give a 10% increment to all employees
    employees = employees.map(emp => {
        emp.salary = emp.salary * 1.1;
        return emp;
    });
    console.log("Employees after 10% increment: ", employees);

// Find the employee salary with the highest salary.
    let highestSalary = employees.reduce((max, emp) => emp.salary > max ? emp.salary : max, 0);
    let highestPaidEmployee = employees.find(emp => emp.salary === highestSalary);
    console.log("Employee with highest salary: ", highestPaidEmployee);

// Add a new employee record.
    employees.push({ id: 4, name: "Sita", salary: 40000 });
    console.log("Employees after adding new record: ", employees);

