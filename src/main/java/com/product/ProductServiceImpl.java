package com.example.product;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final Map<Integer, Product> productMap = new HashMap<>();


    @Override
    public Product addProduct(Product product) throws InvalidProductDataException {
        if(product.getName().length()<1)
            throw new InvalidProductDataException("Product name cannot be blank");
        if(product.getStock()<0)
            throw new InvalidProductDataException("Product stock cannot be negative");
        if(product.getPrice()<=0)
            throw new InvalidProductDataException("Product price cannot be negative or zero");
        productMap.put(product.getId(),product);
        return productMap.get(product.getId());
    }

    @Override
    public Product getProductById(Integer id) throws ProductNotFoundException {
        Product product = productMap.get(id);
        if(product == null)
            throw new ProductNotFoundException("Product not found");
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> productList = productMap.values().stream().collect(Collectors.toList());
        return productList;
    }

    @Override
    public Product updateProduct(Integer id, Product updatedProduct) throws ProductNotFoundException, InvalidProductDataException {
        if (productMap.get(id) == null)
            throw new ProductNotFoundException("Product not found");
        if(updatedProduct.getName().length()<1)
            throw new InvalidProductDataException("Product name cannot be blank");
        if(updatedProduct.getStock()<0)
            throw new InvalidProductDataException("Product stock cannot be negative");
        if(updatedProduct.getPrice()<=0)
            throw new InvalidProductDataException("Product price cannot be negative");
        productMap.put(id,updatedProduct);
        return productMap.get(id);
    }

    @Override
    public Product updateStock(Integer id, Integer Stock) throws ProductNotFoundException, InvalidProductDataException {
        if(productMap.get(id) == null)
            throw new ProductNotFoundException("Product not found");
        if(Stock<0)
            throw new InvalidProductDataException("Product stock cannot be negative");
        productMap.get(id).setStock(Stock);
        return productMap.get(id);
    }

    @Override
    public Product deleteProduct(Integer id) throws ProductNotFoundException {
        if(productMap.get(id) == null)
            throw new ProductNotFoundException("Product not found");
        return productMap.remove(id);
    }

    @Override
    public List<Product> searchProductsByName(String keyword) {
        List<Product> productList = productMap.values().stream().collect(Collectors.toList());
        return productList.stream().filter(product -> product.getName().contains(keyword)).collect(Collectors.toList());
    }
}
