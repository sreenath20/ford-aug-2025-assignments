package com.assignments.assignment9;

import com.training.day9_collections.ProductNameComparator;

import java.util.*;

public class Driver {
    static void EmployeeManagement(){

//        create
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(new Employee(101,"Raj","ET"));
        employeeSet.add(new Employee(103,"Prem","GDIA"));
        employeeSet.add(new Employee(104,"Justin","HR"));
        employeeSet.add(new Employee(101,"Raj","ET"));
        employeeSet.add(new Employee(102,"Yash","MP&L"));
        System.out.println("Employee List: "+employeeSet);

//        delete
        employeeSet.removeIf(employee -> employee.getId().equals(104));
        System.out.println("\nEmployee List after removing employee 104 : "+employeeSet);

//        update department
        for(Employee e:employeeSet){
            if(e.getId().equals(101)){
                e.setDepartment("Industrial Systems IT");
                System.out.println("\nUpdate employee 101 department : "+e);
            }
        }

//        search by id
        System.out.println("\nIs employee 104 in set? "+employeeSet.contains(new Employee(104)));
        System.out.println("Is employee 102 in set? "+employeeSet.contains(new Employee(102)));

//        sorting by name,department,id
        List<Employee> employeeList = new ArrayList<>(employeeSet);
        Collections.sort(employeeList);
        System.out.println("\nSorted by id : "+employeeList);
        employeeList.sort(new EmployeeNameComparator());
        System.out.println("Sorted by name : "+employeeList);
        Collections.sort(employeeList, new EmployeeDepartmentComparator());
        System.out.println("Sorted by department : "+employeeList);

    }

    static void ProductCatalog(){
        
//        create
        Map<Integer, Product> productMap = new HashMap<>();
        productMap.put(5,new Product(5,"Bracelet",8000.0));
        productMap.put(1,new Product(1,"Sofa",20000.0));
        productMap.put(4,new Product(4,"Phone",25000.0));
        productMap.put(3,new Product(3,"Guitar",50000.0));
        productMap.put(2,new Product(2,"Mat",900.0));
        System.out.println("Product List: "+productMap);

//        delete
        productMap.remove(3);
        System.out.println("\nProduct List after deleting key 3 product : "+productMap);
        
//        update price
        Product inMapProduct =  productMap.get(4);
        inMapProduct.setPrice(30000.0);
        System.out.println("\nPrice updated for key 4 :"+productMap.get(4));
        
//        search
        System.out.println("\nDoes product id 5 contains in map? :"+productMap.containsKey(5));
        System.out.println("Product under 10000:");
        for(Product p:productMap.values()){
            if(p.price < 10000.0) System.out.println("-->"+p.name);
        }
        
//        sorting
        List<Product> productList = new ArrayList<>(productMap.values());
        Collections.sort(productList);
        System.out.println("\nSorted by name : "+productList);
        productList.sort(new ProductPriceIncreasingComparator());
        System.out.println("Sorted by price increasing order : "+productList);
        Collections.sort(productList, new ProductPriceDecreasingComparator());
        System.out.println("Sorted by price decreasing order : "+productList);
    }

    static void StudentCourseEnrollment(){

//        adding new courses
        Set<Course> courseSet = new HashSet<>();
        Course course1 = new Course(101,"Software Engineering");
        Course course3 = new Course(103,"Database Management");
        Course course2 = new Course(102,"Testing");
        Course course4 = new Course(104,"UI/UX");
        Course course5 = new Course(105,"Java");
        Course course6 = new Course(106,"Python");
        courseSet.add(course1);
        courseSet.add(course2);
        courseSet.add(course3);
        courseSet.add(course4);
        courseSet.add(course5);
        courseSet.add(course6);

//        read
        System.out.println("Course List: "+courseSet);

//        adding students
        Map<Student,Set<Course>> studentCourseMap = new HashMap<>();
        Student student1 = new Student(241,"Raamji");
        Student student2 = new Student(242,"Raj");
        Student student3 = new Student(243,"Justin");

//        adding courses to students
        studentCourseMap.put(student1,new HashSet<>());
        studentCourseMap.get(student1).add(course1);
        studentCourseMap.get(student1).add(course3);
        studentCourseMap.get(student1).add(course5);
        studentCourseMap.put(student2,new HashSet<>());
        studentCourseMap.get(student2).add(course2);
        studentCourseMap.get(student2).add(course4);
        studentCourseMap.put(student3,new HashSet<>());
        studentCourseMap.get(student3).add(course1);
        studentCourseMap.get(student3).add(course2);
        studentCourseMap.get(student3).add(course4);

        for(Student s: studentCourseMap.keySet()){
            System.out.println("\nCourse enrolled by "+s.name);
            for(Course c:studentCourseMap.get(s)){
                System.out.print(c.courseName+",");
            }
        }

//        update
        for(Student s: studentCourseMap.keySet()){
            if(s.studentID.equals(241)){
                Set<Course> studentCourses = studentCourseMap.get(s);
                studentCourses.remove(course5);
                System.out.println("\n\nCourse 5 removed for student 241 : "+studentCourses);
            }
            if(s.studentID.equals(242)){
                Set<Course> studentCourses = studentCourseMap.get(s);
                studentCourses.add(course3);
                System.out.println("Course 3 added for student 242 : "+studentCourses);
            }
        }

//        delete
        studentCourseMap.remove(student3);
        System.out.println("\nRemove student 243 from map :"+studentCourseMap);

//        searching
        Set<String> coursesTakenByStudent = new HashSet<>();
        for(Set<Course> courses : studentCourseMap.values()){
            for(Course c : courses){
                coursesTakenByStudent.add(c.courseName);
            }
        }
        System.out.println("\nCourse taken by all students : "+coursesTakenByStudent);

    }
    static void VehicleParkingSystem(){
        
//        adding vehicles 
        Set<Vehicle> vehicleSet = new HashSet<>();
        Vehicle vehicle1 = new Vehicle("TN24BE0473","Raamji","Bike");
        Vehicle vehicle2 = new Vehicle("TN14KI5768","Prakash","SUV");
        Vehicle vehicle3 = new Vehicle("AP03SD3789","Thangam","Truck");
        Vehicle vehicle4 = new Vehicle("PY05DS0001","Kaviarasu","Bike");
        vehicleSet.add(vehicle1);
        vehicleSet.add(vehicle2);
        vehicleSet.add(vehicle3);
        vehicleSet.add(vehicle4);
        System.out.println("\nVehicles : "+vehicleSet);
        
//        creating parking lots
        ParkingSlot parkingSlot1 = new ParkingSlot(1,"North_1");
        ParkingSlot parkingSlot2 = new ParkingSlot(8,"North_8");
        ParkingSlot parkingSlot3 = new ParkingSlot(10,"East_2");
        ParkingSlot parkingSlot4 = new ParkingSlot(13,"East_5");
        ParkingSlot parkingSlot5 = new ParkingSlot(19,"South_3");
        ParkingSlot parkingSlot6 = new ParkingSlot(23,"South_7");
        ParkingSlot parkingSlot7 = new ParkingSlot(28,"West_4");
        ParkingSlot parkingSlot8 = new ParkingSlot(20,"West_6");
        Set<ParkingSlot> parkingSlotSet = new HashSet<>();
        parkingSlotSet.add(parkingSlot1);
        parkingSlotSet.add(parkingSlot2);
        parkingSlotSet.add(parkingSlot3);
        parkingSlotSet.add(parkingSlot4);
        parkingSlotSet.add(parkingSlot5);
        parkingSlotSet.add(parkingSlot6);
        parkingSlotSet.add(parkingSlot7);
        parkingSlotSet.add(parkingSlot8);

        System.out.println("Parking vehicle in slots...");
        Map<ParkingSlot,Vehicle> parkingSlotMap = new HashMap<>();
        parkingSlotMap.put(parkingSlot2,vehicle3);
        parkingSlotMap.put(parkingSlot3,vehicle4);
        parkingSlotMap.put(parkingSlot5,vehicle2);
        parkingSlotMap.put(parkingSlot7,vehicle1);
        
//        delete
        vehicleSet.remove(vehicle1);
        System.out.println("\nVehicles after removed vehicle:TN24BE0473 : "+vehicleSet);
     
//        update vehicle details
        for(Vehicle vehicle:vehicleSet){
            if(vehicle.ownerName.equals("/nThangam")){
                vehicle.setType("HeavyLoader");
                System.out.println(vehicle.ownerName+"'s vehicle type changed");
                System.out.println(vehicle);
            }
        }
        
//        read
        System.out.println("\n");
        for(ParkingSlot ps:parkingSlotMap.keySet()){
            System.out.println("Parking Slot : "+ps.slotId+" "+ps.location+" Vehicle parked :"+parkingSlotMap.get(ps).plateNumber);
        }

//        searching
        for(ParkingSlot ps:parkingSlotMap.keySet()){
            if(parkingSlotMap.get(ps).plateNumber.equals("AP03SD3789")){
                System.out.println("\nAP03SD3789 parked at slot :"+ps.slotId+" Location :"+ps.location);
            }
        }
        System.out.println("SUV or Bike typed vehicle details.");
        for(Vehicle vehicle:vehicleSet){
            if(vehicle.type.equals("SUV") || vehicle.type.equals("Bike")){
                System.out.println("Vehicle Type : "+vehicle.type +" Details :"+vehicle.plateNumber+" "+vehicle.ownerName);
            }
        }

//        sorting
        List<Vehicle> vehicleList = new ArrayList<>(vehicleSet);
        Collections.sort(vehicleList);
        System.out.println("\nVehicles sorted by owner's name : "+vehicleList);
        List<ParkingSlot> parkingSlotList = new ArrayList<>(parkingSlotSet);
        Collections.sort(parkingSlotList);
        System.out.println("\nParking Slots sorted by id : "+parkingSlotList);

    }
    public static void main(String[] args) {

        EmployeeManagement();
        ProductCatalog();
        StudentCourseEnrollment();
        VehicleParkingSystem();

    }
}
