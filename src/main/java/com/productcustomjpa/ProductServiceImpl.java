package com.example.productcustomjpa;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product addNewProduct(Product product) throws ProductException {
        return this.productRepository.save(product);
    }

    @Override
    public List<Product> findByPriceBetween(Double min, Double max) {
        return this.productRepository.findByPriceBetween(min, max);
    }

    @Override
    public List<Product> findByNameContainingIgnoreCase(String keyword) {
        return this.productRepository.findByNameContainingIgnoreCase(keyword);
    }

    @Override
    public List<Product> findByCategoryIn(List<String> categories) {
        return this.productRepository.findByCategoryIn(categories);
    }

    @Override
    public List<Product> findTop3ByCategoryOrderByPriceAsc(String category) {
        return this.productRepository.findTop3ByCategoryOrderByPriceAsc(category);
    }

    @Override
    public List<Product> findByCreatedDateAfter(LocalDate date) {
        return this.productRepository.findByCreatedDateAfter(date);
    }

    @Override
    public List<Object[]> findAveragePriceByCategory() {
        return this.productRepository.findAveragePriceByCategory();
    }

    @Override
    public List<Object[]> findMostPopularCategory() {
        return this.productRepository.findMostPopularCategory();
    }

    @Override
    public List<Object[]> calculateStockValueByCategory() {
        return this.productRepository.calculateStockValueByCategory();
    }

    @Override
    public List<Product> findByStockEquals(Integer stock) {
        return this.productRepository.findByStockEquals(stock);
    }

    @Override
    public List<Product> findByStockLessThan(Integer stock) {
        return this.productRepository.findByStockLessThan(stock);
    }

    @Override
    public List<Product> findByExpiryDateBefore(LocalDate date) {
        return this.productRepository.findByCreatedDateBefore(date);
    }

    @Override
    @Transactional
    public int increasePriceByCategory(String category) {
        return this.productRepository.increasePriceByCategory(category);
    }

    @Override
    @Transactional
    public int deleteOutOfStockProducts() {
        return this.productRepository.deleteOutOfStockProducts();
    }

    @Override
    public List<Product> findMostExpensiveProductInEachCategory() {
        return this.productRepository.findMostExpensiveProductInEachCategory();
    }


}
