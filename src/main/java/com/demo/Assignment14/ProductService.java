package com.SpringBoot.src.main.java.ProductManagementAPI;

import java.util.List;

public interface ProductService {

   Product addProduct(Product product) throws InvalidProductDataException,ProductNotFoundException;
   Product getProductById(Integer id) throws ProductNotFoundException;
   List<Product> getAllProducts() throws ProductNotFoundException;
   Product updateProduct(Integer id, Product updatedProduct) throws ProductNotFoundException, InvalidProductDataException;
   Product updateStock(Integer id, Integer stock)throws ProductNotFoundException, InvalidProductDataException;
   Boolean deleteProduct(Integer id) throws ProductNotFoundException;
   Product searchProductsByName(String keyword) throws ProductNotFoundException;

}
