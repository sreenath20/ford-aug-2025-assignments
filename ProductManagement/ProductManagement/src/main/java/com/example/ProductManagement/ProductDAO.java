package com.example.ProductManagement;

import java.util.Collection;

public interface ProductDAO {

    Product addNewProduct(Product newProduct);

    Collection<Product> getAllProducts();

    Product getProductById(Integer id);

    Product updateProduct(Integer id,Product newProduct);

    String deleteProductById(Integer id);

}
