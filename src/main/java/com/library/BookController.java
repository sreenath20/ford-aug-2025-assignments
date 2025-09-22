package com.example.jpamappingassignment.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/{id}/members")
    public List<MemberDto> getMembers(@PathVariable Integer id) throws BookNotFoundException {
        Book book = this.bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException("Book not found"));
        List<Member> members = book.getMembers();
        List<MemberDto>  memberDtos = new ArrayList<>();
        for(Member member : members){
            memberDtos.add(new MemberDto(member.getId(), member.getName(), member.getEmail()));
        }
        return memberDtos;
    }

}
