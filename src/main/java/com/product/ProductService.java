package com.example.product;

import java.util.List;

public interface ProductService {

    Product addProduct(Product product) throws InvalidProductDataException;
    Product getProductById(Integer id) throws ProductNotFoundException;
    List<Product> getAllProducts();
    Product updateProduct(Integer id,Product updatedProduct) throws ProductNotFoundException,InvalidProductDataException;
    Product updateStock(Integer id, Integer Stock) throws ProductNotFoundException,InvalidProductDataException;
    Product deleteProduct(Integer id) throws ProductNotFoundException;
    List<Product> searchProductsByName(String keyword);


}
