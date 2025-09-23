package com.demo.product_jpa_custom;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Optional<Product> findByProductName(String productName);
    List<Product> findByProductPriceBetween(Double min, Double max);
    List<Product> findByProductNameContainingIgnoreCase(String keyword);
    List<Product> findByProductCategoryIn(List<String> categories);

    List<Product> findTop3ByProductCategoryOrderByProductPriceAsc(String category);
    List<Product> findByCreatedDateAfter(LocalDate date);

    @Query("SELECT p.productCategory, AVG(p.productPrice) FROM Product p GROUP BY p.productCategory")
    List<Object[]> findAveragePriceByCategory();

    @Query("SELECT p.productCategory, COUNT(p) as count FROM Product p GROUP BY p.productCategory ORDER BY count DESC")
    List<Object[]> findMostPopularCategory();

    @Query("SELECT p.productCategory, SUM(p.productPrice * p.stock) FROM Product p GROUP BY p.productCategory")
    List<Object[]> calculateStockValueByCategory();

    List<Product> findByStockEquals(Integer stock);
    List<Product> findByStockLessThan(Integer stock);
    List<Product> findByExpiryDateBefore(LocalDate date);

    @Modifying
    @Query("UPDATE Product p SET p.productPrice = p.productPrice * 1.1 WHERE p.productCategory = :category")
    int increasePriceByCategory(@Param("category") String category);

    @Modifying
    @Query("DELETE FROM Product p WHERE p.stock = 0")
    int deleteOutOfStockProducts();

    @Query("SELECT p FROM Product p WHERE p.productPrice = (SELECT MAX(p2.productPrice) FROM Product p2 WHERE p2.productCategory = p.productCategory)")
    List<Product> findMostExpensiveProductInEachCategory();

}
