package com.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductDAOImpl implements ProductDAO {

    private final Map<Integer, Product> productsMap = new HashMap<>();

    @Override
    public Product addNewProduct(Product newProduct) throws InvalidProductDataException{
        if(productsMap.containsKey(newProduct.getId())){
            throw new RuntimeException("Product already exists for id " + newProduct.getId());
        }

        productsMap.put(newProduct.getId(), newProduct);
        return productsMap.get(newProduct.getId());
    }

    @Override
    public Collection<Product> getAllProducts() throws RuntimeException {
        if(productsMap.isEmpty()){
            throw new ProductNotFoundException("There is no products in the database.");
        }
        return productsMap.values();
    }

    @Override
    public Product getProductById(Integer id) {
        if(!productsMap.containsKey(id)){
            throw new ProductNotFoundException("Product does not exist to get for id " + id);
        }
        return productsMap.get(id);
    }

    @Override
    public Product updateProduct(Integer id,Product newProduct) {
        if (!productsMap.containsKey(id)) {
            throw new ProductNotFoundException("Product does not exist to update for id " + newProduct.getId());
        }
        return productsMap.put(newProduct.getId(), newProduct);
    }

    @Override
    public String deleteProductById(Integer id) {
        if(!productsMap.containsKey(id)){
            throw new ProductNotFoundException("Product does not exist to delete for id " + id);
        }
        productsMap.remove(id);
        return "Product has been deleted successfully for id " + id;
    }
}
