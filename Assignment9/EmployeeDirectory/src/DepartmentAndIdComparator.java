import java.util.Comparator;

public class DepartmentAndIdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
       int departmentCompare=o1.getDepartment().compareToIgnoreCase(o2.getDepartment());
       //in the above line first we are comparing dept names
       //so there are 3 returning numbers based on that we will be going further
       //the 3 returning numbers are
       // 1. -1(negative One)- Object1's dept name comes before Object2 alphabetically
       // 2. 0(Zero)- Object1 and 2 having same values (Ignoring Case)
       // 3. +1(+ve One)- opposite of -1 functionalify
       if(departmentCompare!=0){
           // department Comparision will be imolimented only if both are different
            return departmentCompare;
        }
       //this line compares 2 onjects Id; if both DepartmentNAmes are same
        return Integer.compare(o1.getId(),o2.getId());
    }
}
