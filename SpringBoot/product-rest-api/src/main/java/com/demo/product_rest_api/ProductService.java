package com.demo.product_rest_api;

import java.util.Collection;

public interface ProductService {

    Product addNewProduct(Product newProduct) throws ProductException;

    Product getProductById(Integer productId) throws ProductException;

    Collection<Product> getAllProducts() throws ProductException;

    Product updateProduct(Product product) throws ProductException;

    Collection<Product> sortProducts(String sortOrder) throws ProductException;

    Collection<Product> findProductsByName(String productName) throws ProductException;

    Collection<Product> findAllProductsHavingPriceBetween(Double startPrice, Double endPrice) throws ProductException;

    String updateProductPrice(Integer productId, Double updatedPrice) throws ProductException;

    String deleteProductById(Integer productId) throws ProductException;
}
