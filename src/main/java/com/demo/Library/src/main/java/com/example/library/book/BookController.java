package com.example.library.book;

import com.example.library.member.Member;
import com.example.library.member.MemberNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{isbn}members")
    public List<Member> getAllBarrowMembers(@PathVariable String isbn){
        return this.bookService.getEmployee(isbn);
    }

    @GetMapping("{bookId}/getById")
    public List<Member> getAllBooksById(@PathVariable Integer bookId) throws bookNotFoundException {
        return this.bookService.getAllBooksById(bookId);
    }
//Pagination
    @GetMapping("/allbooks")
    public Page<Book> getAllBooks(@RequestParam ( required = false, defaultValue= "1") int page,
                                  @RequestParam(required =false,defaultValue = "5") int size,
                                  @RequestParam (required=false, defaultValue = "title") String sortBy,
                                  @RequestParam (required =false,defaultValue = "ASC")String sortDir,
                                  @RequestParam (required =false)String search)

    {


        //Pagination with sorting

        Sort sort=null;
        if(sortDir.equalsIgnoreCase("ASC")) {
             sort = Sort.by(sortBy).ascending();
        }else{
            sort=Sort.by(sortBy).descending();
        }
        return this.bookService.getAllBooks(PageRequest.of(page-1, size,sort),search);

    }

}
