package com.demo.product;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.Collection;


public interface ProductDAO {

     Product addNewProduct(Product newProduct);

     Collection<Product> getAllProducts();

     Product getProductById(Integer id);

     Product updateProduct(Integer id,Product newProduct);

     String deleteProductById(Integer id);
}
