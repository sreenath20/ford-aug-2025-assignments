package com.demo.product_rest_api;

import java.util.Collection;

public interface ProductService {

    Product addNewProduct(Product newProduct);

    Product getProductById(Integer productId);

    Collection<Product> getAllProducts();

    Product updateProduct(Integer productId, Product product);

    Product updateProductName(Integer productId, String newName);

    String updateProductPrice(Integer productId, Double updatedPrice);

    Product searchProductByName(String productName);

    String deleteProductById(Integer productId);
}
