package com.example.product;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ServiceLayer {

    private final Map<Integer, Product> productRepo = new HashMap<>();

    public Product addProduct(Product product) throws InvalidProductDataException {
        try {
            if (product.getName() == null || product.getPrice() <= 0 || product.getStock() < 0) {
                throw new InvalidProductDataException("Invalid product data");
            }
            productRepo.put(product.getId(), product);
            return product;
        }catch(InvalidProductDataException e) {
            throw e;
        }
    }

    public Product getProduct(Integer id) throws ProductNotFoundException{
        try {
            Product foundProduct = productRepo.get(id);
            if (foundProduct == null) {
                throw new ProductNotFoundException("Product not found");
            }
            else {
                return foundProduct;
            }
        }catch (ProductNotFoundException e){
            throw e;
        }
    }

    public Collection<Product> getAllProducts() {
        Collection<Product> allProducts = productRepo.values();
        return allProducts;
    }

    public Product updateProduct(Integer id, Product product) throws ProductNotFoundException {
        try {
            if(productRepo.get(id) == null) {
                throw new ProductNotFoundException("Product not found");
            }
            else {
                productRepo.replace(id, product);
                return product;
            }
        }catch (ProductNotFoundException e){
            throw e;
        }

    }

    public Product updateStock(Integer id, Integer stock) throws ProductNotFoundException {
        try {
            if(productRepo.get(id) == null) {
                throw new ProductNotFoundException("Product not found");
            }
            else {
                productRepo.get(id).setStock(stock);
                return productRepo.get(id);
            }
        }catch (ProductNotFoundException e){
            throw e;
        }

    }

    public void deleteProduct(Integer id) throws ProductNotFoundException {
        try {
            if(productRepo.get(id) == null) {
                throw new ProductNotFoundException("Product not found");
            }
            else {
                productRepo.remove(id);
            }
        }catch (ProductNotFoundException e){
            throw e;
        }


    }

    public Product searchProductsByName(String keyword) throws ProductNotFoundException {
        try {
            for (Product product : productRepo.values()) {
                if (product.getName().equals(keyword)) {
                    return product;
                }
            }
            throw new ProductNotFoundException("Product not found");
            //return null;
        }catch (ProductNotFoundException e){
            throw e;
        }

    }


}
