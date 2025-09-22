package javatopic.day4_inheritance_encapsulation.assignments.assignment1;

public class Employer {
     String firstName;
     String empid;
     Double salary;
     Integer experienceYear;


    public Employer(String firstName, String empid, Double salary, Integer experienceYear) {
        this.firstName = firstName;
        this.empid = empid;
        this.salary = salary;
        this.experienceYear = experienceYear;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void calculateSalary(){
        salary=salary+(experienceYear *10000);
        //System.out.println("Employer basic Salary is: "+salary);
    }
}
