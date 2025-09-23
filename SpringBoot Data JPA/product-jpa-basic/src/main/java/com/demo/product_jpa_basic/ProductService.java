package com.demo.product_jpa_basic;

import java.util.List;

public interface ProductService {

    Product addProduct(Product product);

    Product getProductById(Integer productId);

    List<Product> getAllProducts();

    Product updateProduct(Integer productId, Product product);

    String deleteProduct(Integer productId);

    Product getProductByName(String productName);
}
