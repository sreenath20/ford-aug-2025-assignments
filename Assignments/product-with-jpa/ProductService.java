package com.demo.product.app;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product addNewProduct(Product newProduct) throws ProductException;

    String updateProductPriceById(Integer id, Double price) throws ProductException;

    Collection<Product> getAllProducts();

    Product getProductById(Integer id) throws ProductException;

    Product getProductByName(String name) throws ProductException;

    String deleteProductById(Integer id) throws ProductException;

    Collection<Product> getProductByStockBetween(Integer stockStart, Integer stockEnd) throws ProductException;

    Collection<Product> getProductsOrderedByPriceAsc();

    Product deleteProductByName(String name) throws ProductException;

//    Searching & Filtering
    Collection<Product> getProductByPriceBetween(Double priceStart, Double priceEnd) throws ProductException;
    Collection<Product> getProductsByNameContaining(String name) throws ProductException;
    Collection<Product> getProductsByCategories(List<String> categories) throws ProductException;

//    Sorting & Ranking
    Collection<Product> getTop3ByCategoryOrderByPriceAsc(String category) throws ProductException;
    Collection<Product> getManufactureDateAfter(LocalDate manufactureDate) throws ProductException;

//    Aggregation Queries (JPQL & Native)
    List<Object[]> getAveragePriceOfCategory() throws ProductException;
    List<Object[]> getItemsCountByCategory() throws ProductException;
    List<Object[]> getStockValueByCategory() throws ProductException;

//    Inventory Management
    Collection<Product> getProductsByStock(Integer quantity) throws ProductException;
    Collection<Product> getProductsByStockLessThan(Integer quantity) throws ProductException;
    Collection<Product> getProductsByExpirationBefore(LocalDate expirationDate) throws ProductException;

//    Bulk Update/Delete
    String increasePriceByCategory(String category, Double percent) throws ProductException;
    String deleteOutOfStockProducts() throws ProductException;


}
