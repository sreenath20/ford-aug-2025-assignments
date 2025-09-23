package com.demo.product_rest_api;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    private final Map<Integer, Product> productRepo = new HashMap<>();

    @Override
    public Product addProduct(Product newProduct) {
        if (newProduct.getProductName() == null || newProduct.getProductName().isEmpty())
            throw new InvalidProductDataException("Product name should not be null or empty");

        if (newProduct.getProductPrice() <= 0)
            throw new InvalidProductDataException("Price should be greater than 0");

        if (newProduct.getStock() < 0)
            throw new InvalidProductDataException("Stock should not be less than 0");

        if (productRepo.containsKey(newProduct.getProductId())) {
            throw new InvalidProductDataException("Product already exists with id: " + newProduct.getProductId());
        }

        productRepo.put(newProduct.getProductId(), newProduct);
        return newProduct;
    }

    @Override
    public Product getProductById(Integer productId) {
        if (!productRepo.containsKey(productId)) {
            throw new ProductNotFoundException("Product with id " + productId + " not found");
        }
        return productRepo.get(productId);
    }

    @Override
    public Collection<Product> getAllProducts() {
        if (productRepo.isEmpty()) {
            throw new ProductNotFoundException("No products found in the system");
        }
        return productRepo.values();
    }

    @Override
    public Product updateProduct(Integer productId, Product updatedProduct) {
        if (updatedProduct.getProductPrice() <= 0)
            throw new InvalidProductDataException("Price should be greater than 0");

        if (updatedProduct.getStock() < 0)
            throw new InvalidProductDataException("Stock should not be less than 0");

        if (!productRepo.containsKey(productId)) {
            throw new ProductNotFoundException("Product with id " + productId + " not found");
        }

        updatedProduct.setProductId(productId);
        productRepo.put(productId, updatedProduct);
        return updatedProduct;
    }

    @Override
    public Product updateStock(Integer productId, Integer stock) {
        if (stock < 0)
            throw new InvalidProductDataException("Stock should not be less than 0");

        if (!productRepo.containsKey(productId)) {
            throw new ProductNotFoundException("Product with id " + productId + " not found");
        }

        Product product = productRepo.get(productId);
        product.setStock(stock);
        productRepo.put(productId, product);
        return product;
    }

    @Override
    public Product searchProductsByName(String keyword) {
        return productRepo.values().stream()
                .filter(product -> product.getProductName().toLowerCase().contains(keyword.toLowerCase()))
                .findFirst()
                .orElseThrow(() -> new ProductNotFoundException("Product with name containing '" + keyword + "' not found"));
    }

    @Override
    public String deleteProduct(Integer productId) {
        if (!productRepo.containsKey(productId)) {
            throw new ProductNotFoundException("Product with id " + productId + " not found");
        }
        Product removedProduct = productRepo.remove(productId);
        return "Product deleted successfully! Product: " + removedProduct.getProductName();
    }
}
