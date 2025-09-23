package com.example.demo.repository;

import com.example.demo.entity.MembershipCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipCardRepository extends JpaRepository<MembershipCard,Integer> {
}
