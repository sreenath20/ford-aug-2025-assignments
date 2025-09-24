package com.abc.app.Ecommerce;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepositoryForEcommerce extends JpaRepository<UserEntity, Integer> {
    @Query("SELECT u FROM UserEntity u LEFT JOIN FETCH u.cartEntity WHERE u.cartEntity.id = :cartId")
        public CartEntity findByIdWithCart(Integer Id) throws Exception;

}
