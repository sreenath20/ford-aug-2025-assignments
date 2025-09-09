package com.abc.app.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class NormalUser {
    @Id
    private Integer id;

    private String name;
    private Integer age;
    private LocalDate dob;

    public NormalUser() {
    }

    public NormalUser(Integer id, String name, Integer age, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dob = dob;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
