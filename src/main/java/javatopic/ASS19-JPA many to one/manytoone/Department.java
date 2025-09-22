package com.e_commerce.onlinemart.manytoone;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;

    @Entity
    public class Department {
        @Id
        @GeneratedValue
        private Integer id;

        private String name;
        private String location;

        @OneToMany(mappedBy = "department", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
        private List<Project> projects = new ArrayList<>();


//        @OneToMany(mappedBy ="department",fetch=FetchType.LAZY, cascade=CascadeType.ALL)
//        private List<Employee> employee=new ArrayList<>();
//        public Department() {
//        }

        public Department(Integer id, String name, List<Project> projects) {
            this.id = id;
            this.name = name;
            this.projects = projects;
        }

//
//        public Department(Integer id, String name, String location, List<Project> projects, List<Employee> employee) {
//            this.id = id;
//            this.name = name;
//            this.location = location;
//            this.projects = projects;
//           // this.employee = employee;
//        }

        public Department() {

        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Project> getProjects() {
            return projects;
        }

        public void setProjects(List<Project> projects) {
            this.projects = projects;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

//        public List<Employee> getEmployee() {
//            return employee;
//        }
//
//        public void setEmployee(List<Employee> employee) {
//            this.employee = employee;
//        }
    }
