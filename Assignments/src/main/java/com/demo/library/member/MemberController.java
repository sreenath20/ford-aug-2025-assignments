package com.demo.library.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping
    public Member registerNewMember(@RequestBody Member newMember) throws MemberAlreadyExistsException {
        return this.memberService.registerNewMember(newMember);
    }

    @GetMapping("/{email}")
    Member getMemberByEmail(@PathVariable String email) throws MemberNotFoundException {
        return this.memberService.getMemberByEmailId(email);
    }


}
