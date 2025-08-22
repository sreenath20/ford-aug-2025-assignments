package com.assignments.assignment8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

    static void EmployeeManagementSystem(){
//        create
        System.out.println("---->Creating employee list ");
        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee(2,"Raamji","ET",50000.0));
        employeesList.add(new Employee(3,"Hariram","MP&L",100000.0));
        employeesList.add(new Employee(5,"Gokul","Finance",80000.0));
        Employee empAbi = new Employee(1,"Abisheik","HR",120000.0);
        employeesList.add(empAbi);
        System.out.println("Employee list "+employeesList);

//        search by id
        System.out.println("---->Searching based on employee id ");
        int index = employeesList.indexOf(new Employee(5));
        System.out.println("Index of employee 5 is " + index);

//        Update salary & department
        System.out.println("---->Update salary & department employee by id ");
        Employee employeeToUpdate;
        int indexToUpdateSalary = employeesList.indexOf(new Employee(2));
        employeeToUpdate = employeesList.get(indexToUpdateSalary);
        employeeToUpdate.setSalary(75000.0);
        System.out.println("Updated salary of employee : "+employeesList.get(indexToUpdateSalary));

        int indexToUpdateDepartment = employeesList.indexOf(new Employee(1));
        employeeToUpdate = employeesList.get(indexToUpdateDepartment);
        employeeToUpdate.setDepartment("L&D");
        System.out.println("Updated department of employee : "+employeesList.get(indexToUpdateDepartment));

//        delete
        System.out.println("----->Deleting employee by id ");
        employeesList.remove(new Employee(3));
        System.out.println("Employee list deleted id 3:"+employeesList);

//        read
        for(Employee e:employeesList){
            System.out.println(e);
        }

    }

    static void LibraryBookManagement(){

        System.out.println("---->Adding books to library");
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "Effective Java", "Joshua Bloch", 499.99));
        bookList.add(new Book(2, "Clean Code", "Robert C. Martin", 3999.95));
        bookList.add(new Book(3, "Design Patterns", "Erich Gamma et al.", 549.50));
        bookList.add(new Book(4, "Introduction to Algorithms", "Cormen et al.", 8999.99));
        bookList.add(new Book(5, "Java Concurrency in Practice", "Brian Goetz", 1499.99));
        new Book().displayBooks(bookList);

        System.out.println("---->Sorted by title");
        Collections.sort(bookList);
        new Book().displayBooks(bookList);

        System.out.println("---->Sorted by price");
        bookList.sort(new BookPriceComparator());
        new Book().displayBooks(bookList);

        System.out.println("---->Sorted by author");
        Collections.sort(bookList, new BookAuthorComparator());
        new Book().displayBooks(bookList);

    }

    static void OnlineShoppingCart(){
//        create
        CartItem cart = new CartItem();
        List<CartItem> cartItemList = new ArrayList<>();

        System.out.println("---->Adding cart items to online shopping cart");
        cart.addItem(cartItemList,new CartItem(101, "Wireless Mouse", 2, 159.99));
        cart.addItem(cartItemList,new CartItem(102, "Mechanical Keyboard", 1, 899.50));
        cart.addItem(cartItemList,new CartItem(103, "USB-C Cable", 3, 79.25));
        cart.addItem(cartItemList,new CartItem(104, "27-inch Monitor", 1, 8229.99));
        cart.addItem(cartItemList,new CartItem(105, "Laptop Stand", 1, 1349.95));
        cart.addItem(cartItemList,new CartItem(104, "27-inch Monitor", 2, 8229.99));
        new CartItem().displayCartItems(cartItemList);

//        update
        System.out.println("---->Updating cart items id 103 from online shopping cart 105 to 3 nos");
        cart.updateQuantity(cartItemList,105,3);
        new CartItem().displayCartItems(cartItemList);

//        delete
        System.out.println("---->Removing cart items id 103 from online shopping cart");
        cart.removeItem(cartItemList,new CartItem(103));
        new CartItem().displayCartItems(cartItemList);

//        search
        System.out.println("---->Searching cart items id 105,110 from online shopping cart");
        cart.searchItem(cartItemList,105);
        cart.searchItem(cartItemList,110);

//        read
        System.out.println("---->Generating bill");
        cart.getTotalBill(cartItemList);

    }
    static void StudentResultManagement(){

//        create
        List<Student> studentsList = new ArrayList<>();
        System.out.println("---->Adding students to student list");
        studentsList.add(new Student(1, "Joshua", 471.5));
        studentsList.add(new Student(2, "Yaash", 450.0));
        studentsList.add(new Student(4, "Monica", 495.5));
        studentsList.add(new Student(3, "Tom", 460.0));
        studentsList.add(new Student(5, "Abhisheik", 485.0));

        System.out.println("---->Sort by marks(Descending order)");
        Collections.sort(studentsList);
        new Student().displayStudents(studentsList);

        System.out.println("---->Sort by name");
        studentsList.sort(new StudentNameComparator());
        new Student().displayStudents(studentsList);

        System.out.println("---->Sort by Roll number");
        Collections.sort(studentsList,new StudentRollNoComparator());
        new Student().displayStudents(studentsList);


//        update
        System.out.println("---->Updating  student marks rollNo 1 to 490.0");
        int index = studentsList.indexOf(new Student(1));
        Student inListStudent = studentsList.get(index);
        inListStudent.setMarks(490.0);
        new Student().displayStudents(studentsList);

//        delete
        System.out.println("---->Deleting student by rollNo 2");
        studentsList.remove(new Student(2));
        new Student().displayStudents(studentsList);

//        search
        System.out.println("---->Searching student by rollNo 3");
        int indexNo = studentsList.indexOf(new Student(3));
        if(indexNo != -1){
            System.out.println("Student with rollNo 3 index is :" + indexNo);
        }else{
            System.out.println("Student not found");
        }
    }
    public static void main(String[] args) {

//        for code readability created static methods for each assignment
        EmployeeManagementSystem();
        LibraryBookManagement();
        OnlineShoppingCart();
        StudentResultManagement();


    }
}
