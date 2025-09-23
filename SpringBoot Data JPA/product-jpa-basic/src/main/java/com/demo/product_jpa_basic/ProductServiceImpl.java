package com.demo.product_jpa_basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Integer productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new ProductException("Product not found with id: " + productId));
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = productRepository.findAll();
        if (products.isEmpty()) {
            throw new ProductException("No products found");
        }
        return products;
    }

    @Override
    public Product updateProduct(Integer productId, Product product) {
        Product existingProduct = getProductById(productId);

        existingProduct.setProductName(product.getProductName());
        existingProduct.setProductCategory(product.getProductCategory());
        existingProduct.setProductPrice(product.getProductPrice());
        existingProduct.setStock(product.getStock());

        return productRepository.save(existingProduct);
    }

    @Override
    public String deleteProduct(Integer productId) {
        Product product = getProductById(productId);
        productRepository.delete(product);
        return "Product deleted successfully: " + product.getProductName();
    }

    @Override
    public Product getProductByName(String productName) {
        return productRepository.findByProductName(productName)
                .orElseThrow(() -> new ProductException("Product not found with name: " + productName));
    }
}
