package com.demo.library.member;

public interface MemberService {

    Member registerNewMember(Member newMember) throws MemberAlreadyExistsException;

    Member getMemberByEmailId(String email) throws MemberNotFoundException;
}
