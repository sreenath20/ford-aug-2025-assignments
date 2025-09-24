package com.abc.app.Ecommerce;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartEntity,Integer> {
}
