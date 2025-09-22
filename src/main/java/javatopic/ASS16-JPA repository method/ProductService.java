package com.product_management.product;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

public interface ProductService {

    // with map for storing the data
    Product addProduct(Product product) throws InvalidProductDataException;
    Product getProductById(Integer id) throws ProductNotFoundException;
    Collection<Product> getAllProducts() throws ProductNotFoundException;
    Product updateProduct(Integer id,Product product) throws InvalidProductDataException;
    Product updateStock(Integer id,Integer stock)throws InvalidProductDataException;
    Product deleteProduct(Integer id)throws ProductNotFoundException;
    Collection<Product> searchProductsByName(String name);
    Collection<Product> searchProductsByPriceBetween(Double priceBefore, Double priceAfter);
    Collection<Product> searchProductsByStockLessThan(Integer stock);

    //jpa repository for storing the data

//    Collection<Product> findProductByPrice(Double price);
//
//    Collection<Product> searchProductsByNameCaseInSensitive(String name);
//
//    Collection<Product> findProductTop3CategoryOrderByPriceAsc(String category);
//
//    Collection<Product> findNewestProductsLastWeek();
//
//    Collection<Product> findProductByDateAfter(LocalDate date);
//
//    List<Object[]> findAveragePriceByCategory(String category);
//
//    List<Object[]> findMostPopularByCategory();
//
//    List<Object[]> findStockValueByCategory();
//
//    List<Product> findByStockEqual(Integer stock);
//
//    List<Product> findByStockLessThan(Integer stock);
//
//    int updateProductPriceByCategory(String category);
//
//    Collection<Product> updateProductPriceByCategory();
//
//    int deleteProductByStockCount(Integer stock);
//
//    List<Product> findMostExpensiveProductInEachCategory();
//
//    Page<Product> findByCategory(String category, Pageable pageable);

}
