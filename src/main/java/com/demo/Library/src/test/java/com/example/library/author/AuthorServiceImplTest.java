package com.example.library.author;

import com.example.library.book.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;



@SpringBootTest
@Transactional
@ActiveProfiles("test")
class AuthorServiceImplTest {
    @Autowired
    private AuthorService authorService;

    @Autowired
    private AuthorRepo authorRepo;

    private Author author;
    @BeforeEach
    void setUp() {
        this.author =new Author(2,"AB","TK");
    }

    //positive testcase to add author
@Test
    void addNewAuthor()  {

        assumeTrue(authorService!=null);
        try{
            Author newAuthor = authorService.addNewAuthor(author);
            assertEquals("AB",newAuthor.getName());

        }catch(AuthorNotFoundException e){
            throw new RuntimeException(e);
        }

    }


    //negative testcase
@Test
void checkIfAuthorExists()  {
        try{
            this.authorService.addNewAuthor(author);
           AuthorNotFoundException exception= assertThrows(AuthorNotFoundException.class,()-> this.authorService.addNewAuthor(author));
            assertEquals("Author already exists",exception.getMessage());
        }
        catch(AuthorNotFoundException e){
            throw new RuntimeException(e);
        }
}
     @Test

     //positve test case to add books for specific author

     void addbookToAuthor()  {
        Book newBook= new Book(101,"JK","1034A");
        try{
            Author newAuthor = authorService.addNewAuthor(author);
            this.authorService.addBooktoAuthor(newAuthor.getId(), newBook);
            assertEquals(newBook.getISBN(),"1034A");
            assertEquals(1,newAuthor.getBookList().size());
        }catch(BookAlreadyExistsException e) {
            throw new RuntimeException(e);
        }
        catch (AuthorNotFoundException e) {
            throw new RuntimeException(e);
        }
     }

//negative test case
     @Test
     void toCheckAuthorisEmpty(){
         Book newBook= new Book(101,"JK","1034A");
         AuthorNotFoundException Exception=assertThrows(AuthorNotFoundException.class,()-> this.authorService.addBooktoAuthor(3,newBook));
         assertEquals("Author not found",Exception.getMessage());

     }

@Test
 void getBook(){
        try{
            Author newAuthor = authorService.addNewAuthor(author);
            Book newBook= new Book(101,"JK","1034A");
            this.authorService.addBooktoAuthor(newAuthor.getId(),newBook);
            this.authorService.getBooksByAuthor(newAuthor.getId());
            assertEquals(1,newAuthor.getBookList().size());
        }catch(AuthorNotFoundException e){
            throw new RuntimeException(e);
        }catch(BookAlreadyExistsException e){
            throw new RuntimeException(e);
        }
}
    @Test
    void toCheck(){
        Book newBook= new Book(101,"JK","1034A");
        AuthorNotFoundException Exception=assertThrows(AuthorNotFoundException.class,()-> this.authorService.getBooksByAuthor(3));
        assertEquals("Author not found",Exception.getMessage());

    }

     //occurs for every methods
    @AfterEach
    void tearDown() {
        this.authorRepo.deleteAll();
    }
}