package javatopic.day10_collections_set.exercises.exercise2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

public static void main(String[] args) {
    Set<Student> students =new HashSet<>();
    students.add(new Student("Raj","101"));
    students.add(new Student("Priya","102"));
    students.add(new Student("Kumar","103"));
    students.add(new Student("Amit","104"));
    students.add(new Student("Raj","101"));
    students.add(new Student("Zara","106"));

    System.out.println(students);
    System.out.println("------------------------------------");
    Set<Student> students1 = new LinkedHashSet<>();
    System.out.println("LINKED HASH SET");
    students1.add(new Student("Raj","107"));
    students1.add(new Student("Priya","108"));
    students1.add(new Student("Kumar","109"));
    students1.add(new Student("Zara","110"));
    students1.add(new Student("Raj","107"));
    System.out.println(students1);
    System.out.println("------------------------------------");


    System.out.println(students);
    Set<Student> students2 = new TreeSet<>(students);
    System.out.println("------------------------------------");
    System.out.println("TREES SET");
    System.out.println(students2);


    // check for student
    boolean presentStatus=students2.contains(new Student("Raj","101"));
    System.out.println("present status of student raj   : "+presentStatus);


    System.out.println("Amit present in class?: "+students2.contains(new Student("Amit","104")));

}
}
