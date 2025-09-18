package com.example.jpamappingassignment.onetoone;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<CartUser, Long> {
}
