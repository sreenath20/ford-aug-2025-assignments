package com.example.ProductMangementJPA;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface ProductDao extends JpaRepository<Product, Integer> {

    Optional<Product> findByName(String name);

    Collection<Product> findByOrderByPriceAsc();

    Collection<Product> findByStockBetween(Integer stockStart, Integer stockEnd);

    @Modifying
    @Query("UPDATE Product  product SET product.price = :price WHERE product.id = :id")
    int updateProductPrice(@Param("id") Integer Id,@Param("price") Double price) throws ProductException;


    @Modifying(clearAutomatically = true)
    @Query("DELETE FROM Product p WHERE p.name=:pname")
    void deleteByName(@Param("pname") String name);

    //1.Searching & Filtering
    Collection<Product> findByPriceBetween(Double priceStart, Double priceEnd);
    Collection<Product> findByNameContainingIgnoreCase(String name);
    Collection<Product> findByCategoryIn(List<String> categories);

    //2.Sorting & Ranking
    Collection<Product> findTop3ByCategoryOrderByPriceAsc(String category);
    Collection<Product> findByManufactureDateAfter(LocalDate manufactureDate);

    //3.Aggregation Queries (JPQL & Native)
    @Query("SELECT p.category, AVG(p.price) FROM Product p GROUP BY p.category")
    List<Object[]> findAveragePriceByCategory();

    @Query("SELECT p.category, COUNT(p) as count FROM Product p GROUP BY p.category ORDER BY count DESC")
    List<Object[]> findMostPopularCategory();

    @Query("SELECT p.category, SUM(p.price * p.stock) FROM Product p GROUP BY p.category")
    List<Object[]> calculateStockValueByCategory();

    //4.Inventory Management
    Collection<Product> findByStockEquals(Integer stock);
    Collection<Product> findByStockLessThan(Integer stock);
    Collection<Product> findByExpirationDateBefore(LocalDate expirationDate);

    //5.Bulk Update/Delete
    @Modifying
    @NativeQuery(value = "UPDATE Product SET price = price * :percentage WHERE category = :pcategory")
    int increasePriceByCategory(@Param("pcategory") String category, @Param("percentage")  Double percent);

    @Modifying
    @Query("DELETE FROM Product p WHERE p.stock = 0")
    int deleteOutOfStockProducts();
}
