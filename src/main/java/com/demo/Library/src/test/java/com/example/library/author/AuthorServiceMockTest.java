package com.example.library.author;


import com.example.library.book.Book;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AuthorServiceMockTest {
    @MockitoBean
    private AuthorRepo authorRepo;

    @Autowired
    private AuthorService authorService;

    //using WHEN THEN Pattern

    @Test
    void testGetsAuthor() throws Exception {
        Author author = new Author(1,"AK","at");
        Book newBook = new Book(101,"ar","120AB");

        List<Book> bookList = new ArrayList<>();
        bookList.add(newBook);
        author.setBookList(bookList);


        Mockito.when(authorRepo.findById(1)).thenReturn(Optional.of(author));

        //List<Book> result = authorService.getBooksByAuthor(1);

        try{
            List<Book> book=authorService.getBooksByAuthor(1);
            assertEquals(1,book.size());
        }catch(AuthorNotFoundException e){
            throw new RuntimeException(e);
        }


    }
//    @Test
//    void addbook(){
//        Mockito.when(authorRepo.save)
//    }

}
