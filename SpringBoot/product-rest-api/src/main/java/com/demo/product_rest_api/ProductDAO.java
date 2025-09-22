package com.demo.product_rest_api;

import java.util.Collection;

public interface ProductDAO {

    Product saveProduct(Product newProduct) throws ProductException;

    Product getProductById(Integer productId) throws ProductException;

    Product updateProduct(Product product) throws ProductException;

    Collection<Product> getAllProducts() throws ProductException;

    Boolean deleteProductById(Product product) throws ProductException;

    Product updatePrice(Product product, Double updatedPrice) throws ProductException;
}
