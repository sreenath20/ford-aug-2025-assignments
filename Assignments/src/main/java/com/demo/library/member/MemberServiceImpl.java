package com.demo.library.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member registerNewMember(Member newMember) throws MemberAlreadyExistsException {
        Optional<Member> memberOptional = this.memberRepository.findByEmail(newMember.getEmail());
        if (memberOptional.isPresent())
            throw new MemberAlreadyExistsException("Member already present with given email!");
        return this.memberRepository.save(newMember);
    }

    @Override
    public Member getMemberByEmailId(String email) throws MemberNotFoundException {

        Optional<Member> memberOptional = this.memberRepository.findByEmail(email);
        if (memberOptional.isEmpty())
            throw new MemberNotFoundException("Member does not exists for given email!");
        return memberOptional.get();
    }
}
