package com.SpringBoot.src.main.java.ProductManagementAPI;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    Map<Integer,Product> productsRepo=new HashMap<>();
    @Override
    public Product addProduct(Product product) throws InvalidProductDataException,ProductNotFoundException {

        try {
            if(productsRepo.containsKey(product.getId())==true){
                throw new ProductNotFoundException("Product not found");
            }
            else{
                productsRepo.put(product.getId(),product);
                return product;
            }


        }catch(Exception e){
            throw new InvalidProductDataException(e.getMessage());
        }
    }

    @Override
    public Product getProductById(Integer id) throws ProductNotFoundException {
        return null;
    }

    @Override
    public List<Product> getAllProducts() throws ProductNotFoundException {
        try{
            if(productsRepo.isEmpty()==true){
                throw new ProductNotFoundException("Product not found");
            }
            else{
                return productsRepo.values().stream().toList();
            }

        }catch(Exception e){
            throw new ProductNotFoundException(e.getMessage());
        }

    }

    @Override
    public Product updateProduct(Integer id, Product updatedProduct) throws ProductNotFoundException, InvalidProductDataException {
        return null;
    }

    @Override
    public Product updateStock(Integer id, Integer stock) throws ProductNotFoundException, InvalidProductDataException {
        return null;
    }

    @Override
    public Boolean deleteProduct(Integer id) throws ProductNotFoundException {
        return null;
    }

    @Override
    public Product searchProductsByName(String keyword) throws ProductNotFoundException {
        return null;
    }
}
