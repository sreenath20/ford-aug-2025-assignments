package com.demo.product;

import java.util.Collection;

public interface ProductService {

    Product addNewProduct(Product product);

    Product getProductById(Integer id);

    Collection<Product> getAllProducts();

    Product updateProduct(Integer id,Product product);

    Product updateStockById(Integer id, Integer stock);

    String deleteProductById(Integer id);

    Product searchProductByName(String name);

}
