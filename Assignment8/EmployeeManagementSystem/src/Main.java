import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //CRUD - Create arrayList
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"trixie","dept1",12000.0));
        employees.add(new Employee(2,"ravi","dept2",15000));
        employees.add(new Employee(3,"baskar","dept3",20000));
        employees.add(new Employee(4,"hemanth","dept4",50000));


        //CRUD - Update salary based on id using for loop
        System.out.println();
        System.out.println("Before update :"+employees.toString());
        for(Employee e:employees){
            if(e.getId() == 3){
                e.setSalary(e.getSalary()+(e.getSalary()*0.5));
            }
        }
        System.out.println();
        System.out.println("After update :"+employees.toString());

        //CRUD - Delete employee based on id
        employees.removeIf(e -> e.getId() == 2);
        System.out.println();
        System.out.println("After removal of employee based on ID 2:"+employees.toString());

        //Search Employee by id using contains() and indexOf() methods

        //we need to create a dummy and insert the id to be searched into it
        int searchID=8;
        Employee employee = new Employee(searchID,"","",0);
        if(employees.contains(employee))
        {
            int index=employees.indexOf(employee);
            Employee foundEmp=employees.get(index);
            System.out.println("employee match found: "+foundEmp );
        }
        else{
            System.out.println("employee with id "+searchID+" not found");
        }

        //CRUD - Reading using for loop
        System.out.println(employees.get(0));
        System.out.println(employees.get(1));
        System.out.println(employees.get(2));



    }
}