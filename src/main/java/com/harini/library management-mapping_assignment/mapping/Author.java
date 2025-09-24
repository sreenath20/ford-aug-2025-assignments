package com.example.mapping_assignment.mapping;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
    private List<Books> booksList = new ArrayList<>();

    public Author() {}

    public Author(Integer id, String name, List<Books> booksList) {
        this.id = id;
        this.name = name;
        this.booksList = booksList;
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

    public List<Books> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Books> booksList) {
        this.booksList = booksList;
    }
}
