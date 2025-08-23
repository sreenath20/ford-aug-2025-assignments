package Java_Set_UserDefined_Exercise;

import java.util.*;

public class StudentSetDemo {

    // Student class: equality is based on id only
    static class Student implements Comparable<Student> {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() { return id; }
        public String getName() { return name; }

        @Override
        public String toString() {
            return "Student{id=" + id + ", name='" + name + "'}";
        }

        // Two students are considered equal if their id is the same.
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student other = (Student) o;
            return this.id == other.id;
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(id);
        }

        // Natural ordering by id (needed for TreeSet)
        @Override
        public int compareTo(Student other) {
            return Integer.compare(this.id, other.id);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Raj");
        Student s2 = new Student(102, "Priya");
        Student s3 = new Student(103, "Amit");
        Student s4 = new Student(101, "Raj");   // duplicate id
        Student s5 = new Student(104, "Zara");

        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);

        // 1. HashSet (no guaranteed order)
        Set<Student> hashSet = new HashSet<>();
        hashSet.addAll(students);

        // 2. LinkedHashSet (preserves insertion order)
        Set<Student> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(students);

        // 3. TreeSet (sorted by id because Student implements Comparable)
        Set<Student> treeSet = new TreeSet<>();
        treeSet.addAll(students);

        // Print contents
        System.out.println("HashSet output: " + hashSet);
        System.out.println("LinkedHashSet output: " + linkedHashSet);
        System.out.println("TreeSet output: " + treeSet);

        // Membership check using a newly created Student with same id as s3
        Student query = new Student(103, "Amit");
        System.out.println();
        System.out.println("Does HashSet contain Student(103, \"Amit\")? " + hashSet.contains(query));
        System.out.println("Does LinkedHashSet contain Student(103, \"Amit\")? " + linkedHashSet.contains(query));
        System.out.println("Does TreeSet contain Student(103, \"Amit\")? " + treeSet.contains(query));
    }
}
