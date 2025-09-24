package com.abc.app.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserInformation,Integer> {
    Optional<UserInformation> findByEmailId(String emailId);
}
