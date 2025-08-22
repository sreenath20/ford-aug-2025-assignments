package javatopic.day4_inheritance_encapsulation.assignments.assignment1;

public class Manager extends Employer{

   Double bonus=1000.0;

    public Manager(String firstName, String empid, Double salary, Integer experienceYear, Double bonus) {
        super(firstName, empid, salary, experienceYear);
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override

    public void calculateSalary() {
        this.salary=this.salary+(this.experienceYear *10000)+this.bonus;
        System.out.println("Manager Salary is "+ salary);
    }
}
