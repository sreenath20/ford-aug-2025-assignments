package com.abc.app.jpa_mappings.manytomany;

public class StudentDto {

    private Integer id;

    private String name;

    public StudentDto() {
    }

    public StudentDto(Integer id, String name) {
        this.id = id;
        this.name = name;
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
}
