package com.example.productcustomjpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByPriceBetween(Double min, Double max);

    List<Product> findByNameContainingIgnoreCase(String keyword);

    List<Product> findByCategoryIn(List<String> categories);

    List<Product> findTop3ByCategoryOrderByPriceAsc(String category);

    List<Product> findByCreatedDateAfter(LocalDate date);

    @Query("SELECT p.category, AVG(p.price) FROM Product p GROUP BY p.category")
    List<Object[]> findAveragePriceByCategory();

    @Query("SELECT p.category, COUNT(p) as count FROM Product p GROUP BY p.category ORDER BY count DESC")
    List<Object[]> findMostPopularCategory();

    @Query("SELECT p.category, SUM(p.price * p.stock) FROM Product p GROUP BY p.category")
    List<Object[]> calculateStockValueByCategory();

    List<Product> findByStockEquals(Integer stock);

    List<Product> findByStockLessThan(Integer stock);

    List<Product> findByCreatedDateBefore(LocalDate date);

    @Modifying
    @Query("UPDATE Product p SET p.price = p.price * 1.1 WHERE p.category = :category")
    int increasePriceByCategory(@Param("category") String category);

    @Modifying
    @Query("DELETE FROM Product p WHERE p.stock = 0")
    int deleteOutOfStockProducts();

    @Query("SELECT p FROM Product p WHERE p.price = (SELECT MAX(p2.price) FROM Product p2 WHERE p2.category = p.category)")
    List<Product> findMostExpensiveProductInEachCategory();

}
