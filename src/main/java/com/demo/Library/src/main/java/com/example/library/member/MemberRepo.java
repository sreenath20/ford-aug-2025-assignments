package com.example.library.member;

import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepo extends JpaRepository<Member,Integer> {

    Member findByEmail(String email);
}
