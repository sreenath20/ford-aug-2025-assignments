package com.abc.app.product;

import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface ProductRepository extends JpaRepository<ElectronicsProduct,Integer> {
}
// ProductDao IS-A JpaRepository