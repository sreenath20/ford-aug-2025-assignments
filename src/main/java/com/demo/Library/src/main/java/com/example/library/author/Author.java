package com.example.library.author;


import com.example.library.book.Book;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Author {
    @Id
    private Integer id;

    @NotNull(message="name must not be null")
    @NotEmpty(message = "Name cannot be Empty")
    @NotBlank(message="it should not have any empty space")
    private String name;

    @Size(min=1, max=2,message = "contains only two character")
    //min(2) and Max(3) which is different from size
    private String nationality;

    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)

    private List<Book> bookList = new ArrayList<>();

    public Author() {
    }

    public Author(Integer id,String name, String nationality) {

        this.id = id;
        this.name = name;
        this.nationality = nationality;
    }

    //helper methods to add book with author
    public void addBook(Book book) {
        this.bookList.add(book);
        book.setAuthor(this);
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

}
