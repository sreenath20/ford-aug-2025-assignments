/*package topic.day10_collections_set;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    Set<Integer> integerSet = new HashSet<>();

    //Set
    // no order
    // not sorted
    // no duplicates [at any given point of time]
    // Create
        integerSet.add(6);
        integerSet.add(3);
        integerSet.add(99);
        integerSet.add(11);
        System.out.println("6 got inserted ? :" + integerSet.add(6));
        System.out.println(integerSet);

    // read
        for (Integer data : integerSet) {
        System.out.println(data);
    }
    //
        System.out.println("Set contains 100 ?" + integerSet.contains(100));
    // Update i.e remove and add new element
        integerSet.remove(99);
        System.out.println(integerSet);
        integerSet.add(199);
        System.out.println(integerSet);
    // delete
        integerSet.remove(3);
        System.out.println(integerSet);
        System.out.println("Is set empty :" + integerSet.size());
        integerSet.clear();
        System.out.println("Set after clear:" + integerSet);
    Set<String> namesSet = new HashSet<>();

        namesSet.add("Ford");
        namesSet.add("india");
        namesSet.add("Chennai");
        System.out.println(namesSet);
    Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(new Employee(6, "Name 5", 5000.0));
        employeeSet.add(new Employee(1, "Name 2", 4000.0));
        employeeSet.add(new Employee(3, "Name 1", 6000.0));
    Employee duplicateEmployee = new Employee(5, "Name 6", 8000.0);
        employeeSet.add(duplicateEmployee);

        System.out.println(employeeSet);
    // add duplicate
//        employeeSet.add(new Employee(5,"Name 6",8000.0));
        employeeSet.add(duplicateEmployee);
        System.out.println(employeeSet);
        employeeSet.add(new Employee(5, "Name 6", 8000.0));
        System.out.println(employeeSet);
    // iterate
        for(Employee employee : employeeSet){
        System.out.println(employee);
    }
    // task update emp id 6 salary by 10 %
        for (Employee employee:employeeSet){
        if(employee.getId().equals(6)){
            employee.setSalary(employee.getSalary()*1.1); // 10% increase
            break;
        }

    }
        System.out.println(employeeSet);
    // delete employee having id = 1
        employeeSet.remove(new Employee(1,"Name 2", 4000.0));
        System.out.println(employeeSet);
    // sort a set
    //Collections.sort(employeeSet);// only list can be sorted using Collections.sot()
    List<Employee> employeeList = new ArrayList<>(employeeSet);
        //Collections.sort(employeeList);
        System.out.println("Sorted emp list:"+ employeeList);
    //employeeSet.sort(); // Cannot resolve method 'sort' in 'Set'
    HashSet<Employee> employeeSetObj = (HashSet<Employee>) employeeSet;// down casting
    // how to retain the order in set?
    Set<Integer> numberSet = new LinkedHashSet<>();
        numberSet.add(6);
        numberSet.add(3);
        numberSet.add(99);
        numberSet.add(11);
        System.out.println("Linked set"+ numberSet);

    // removeAll
    Set<Integer> firstSet = new HashSet<>();
        firstSet.add(2);
        firstSet.add(4);
        firstSet.add(6);
        System.out.println("first set:"+firstSet);
    Set<Integer> secondSet = new HashSet<>();

        secondSet.add(3);
        secondSet.add(5);
        secondSet.add(7);
        secondSet.add(6);
        System.out.println("second set:"+ secondSet);
        firstSet.removeAll(secondSet);
        System.out.println("First set"+firstSet);
// containsAll
        System.out.println("contains all :"+ firstSet.containsAll(secondSet));

    //  retainAll
        secondSet.add(2);
        System.out.println("second set:"+ secondSet);
        firstSet.retainAll(secondSet);
        System.out.println("First set:"+ firstSet);
// addAll()
        firstSet.addAll(secondSet);
        System.out.println("first set:"+firstSet);
}
}
*/
