package com.e_commerce.onlinemart;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OnlineMartDao extends JpaRepository<Users, Long> {

    Users findUsersAndCartById(Long id);

}
