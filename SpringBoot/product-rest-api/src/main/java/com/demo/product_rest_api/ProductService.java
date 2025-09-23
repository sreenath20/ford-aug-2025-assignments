package com.demo.product_rest_api;

import java.util.Collection;

public interface ProductService {

    Product addProduct(Product newProduct);

    Product getProductById(Integer productId);

    Collection<Product> getAllProducts();

    Product updateProduct(Integer productId, Product product);

    Product updateStock(Integer productId, Integer stock);

    Product searchProductsByName(String keyword);

    String deleteProduct(Integer productId);
}
