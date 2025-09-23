package com.demo.product_jpa_custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
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
        existingProduct.setCreatedDate(product.getCreatedDate());
        existingProduct.setExpiryDate(product.getExpiryDate());
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

    @Override
    public List<Product> findByPriceBetween(Double min, Double max) {
        return productRepository.findByProductPriceBetween(min, max);
    }

    @Override
    public List<Product> findByNameContaining(String keyword) {
        return productRepository.findByProductNameContainingIgnoreCase(keyword);
    }

    @Override
    public List<Product> findByCategoryIn(List<String> categories) {
        return productRepository.findByProductCategoryIn(categories);
    }

    @Override
    public List<Product> findTop3ByCategoryOrderByPriceAsc(String category) {
        return productRepository.findTop3ByProductCategoryOrderByProductPriceAsc(category);
    }

    @Override
    public List<Product> findByCreatedDateAfter(LocalDate date) {
        return productRepository.findByCreatedDateAfter(date);
    }

    @Override
    public List<Object[]> findAveragePriceByCategory() {
        return productRepository.findAveragePriceByCategory();
    }

    @Override
    public List<Object[]> findMostPopularCategory() {
        return productRepository.findMostPopularCategory();
    }

    @Override
    public List<Object[]> calculateStockValueByCategory() {
        return productRepository.calculateStockValueByCategory();
    }

    @Override
    public List<Product> findOutOfStockProducts() {
        return productRepository.findByStockEquals(0);
    }

    @Override
    public List<Product> findLowStockProducts() {
        return productRepository.findByStockLessThan(10);
    }

    @Override
    public List<Product> findByExpiryDateBefore(LocalDate date) {
        return productRepository.findByExpiryDateBefore(date);
    }

    @Override
    public int increasePriceByCategory(String category) {
        return productRepository.increasePriceByCategory(category);
    }

    @Override
    public int deleteOutOfStockProducts() {
        return productRepository.deleteOutOfStockProducts();
    }

    @Override
    public List<Product> findMostExpensiveProductInEachCategory() {
        return productRepository.findMostExpensiveProductInEachCategory();
    }

}
