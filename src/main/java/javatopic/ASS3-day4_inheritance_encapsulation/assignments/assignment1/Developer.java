package javatopic.day4_inheritance_encapsulation.assignments.assignment1;

public class Developer extends Employer{
    Double projectAllowance;

    public Developer(String firstName, String empid, Double salary, Integer experienceYear, Double projectAllowance) {
        super(firstName, empid, salary, experienceYear);
        this.projectAllowance = projectAllowance;
    }

    public Double getProjectAllowance() {
        return projectAllowance;
    }

    public void setProjectAllowance(Double projectAllowance) {
        this.projectAllowance = projectAllowance;
    }

    public void calculateSalary() {
        salary=salary+(experienceYear *10000)+projectAllowance;
        System.out.println("Developer Salary is: "+salary);
    }


}
