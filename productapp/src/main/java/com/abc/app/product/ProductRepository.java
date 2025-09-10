package com.abc.app.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ElectronicsProduct,Integer> {

}
