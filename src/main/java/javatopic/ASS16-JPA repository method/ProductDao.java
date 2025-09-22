package com.product_management.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

public interface ProductDao extends JpaRepository<Product,Integer> {
    // instead of creating own interface
    // we can use DATA JPA

    //ProductDao IS A JpaRepository

    // it is called boiler plate
//  1.  Get products having price  (<= , >=) Between amount
//2. Check products having or out of  stack quantity < = number
//    /product/price?min=500&max=1500
//
//            /product/stock?quantity=1


    Collection<Product> findByName(String name);

    Collection<Product> findProductByPriceBetween(Double priceAfter, Double priceBefore);

    // Find low-stock products
    List<Product> findByStockLessThan(Integer stockIsLessThan);

    Collection<Product> findByPriceEquals(Double price);

    Collection<Product> findByNameIgnoreCase(String name);


    
    @Query("SELECT p FROM Product p where p.category=?1 order by p.price ASC LIMIT 3")
    Collection<Product> findByCategoryContaining(String category);


    @Query("SELECT p FROM Product p ORDER BY p.manufactureDate DESC LIMIT 5 ")
    Collection<Product> findByManufactureDateContaining();

    Collection<Product> findByManufactureDateAfter(LocalDate date);

    //Aggregation Queries (JPQL / Native
    @Query("SELECT p.category, AVG(p.price) FROM Product p WHERE p.category=?1")
    List<Object[]>findByCategoryAveragePrice(String category);

    @Query("SELECT p.category, COUNT(p.category) AS count FROM Product p GROUP BY p.category ORDER BY count DESC")
    List<Object[]> findPopularProductsByCategory();




    @Query("SELECT p.category, SUM(p.price*p.stock) FROM Product p GROUP BY p.category")
    List<Object[]> findStockValueByCategory();

    // . Inventory Management
    List<Product> findByStockEquals(Integer stock);


    //UPDATE & DELETE QUERY
    @Query("UPDATE Product p SET p.price = p.price * 1.1 WHERE p.category = :category")
    @Modifying
    int updateProductByPriceContaining(String category);

    @Modifying
    int deleteProductByStockEquals(Integer stock);



    @Query("SELECT p FROM Product p WHERE p.price = (SELECT MAX(p2.price) FROM Product p2 WHERE p2.category = p.category)")
    List<Product> findMostExpensiveProductInEachCategory();



    @Query("SELECT p FROM Product p WHERE p.id NOT IN (SELECT od.product.id FROM OrderDetail od WHERE od.order.date > :date)")
    List<Product> findUnpurchasedProducts(@Param("date") LocalDate date);

    //Pagination & Performance
    Page<Product> findByCategory(String category, Pageable pageable);

    //Find the cheapest products 
    Page<Product> findAllByOrderByPriceAsc(Pageable pageable)
}
