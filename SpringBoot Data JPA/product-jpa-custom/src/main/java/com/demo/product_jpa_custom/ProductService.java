package com.demo.product_jpa_custom;

import java.time.LocalDate;
import java.util.List;

public interface ProductService {

	Product addProduct(Product product);
	Product getProductById(Integer productId);
	List<Product> getAllProducts();
	Product updateProduct(Integer productId, Product product);
	String deleteProduct(Integer productId);
	Product getProductByName(String productName);

	List<Product> findByPriceBetween(Double min, Double max);
	List<Product> findByNameContaining(String keyword);
	List<Product> findByCategoryIn(List<String> categories);

	List<Product> findTop3ByCategoryOrderByPriceAsc(String category);
	List<Product> findByCreatedDateAfter(LocalDate date);

	List<Object[]> findAveragePriceByCategory();
	List<Object[]> findMostPopularCategory();
	List<Object[]> calculateStockValueByCategory();

	List<Product> findOutOfStockProducts();
	List<Product> findLowStockProducts();
	List<Product> findByExpiryDateBefore(LocalDate date);

	int increasePriceByCategory(String category);
	int deleteOutOfStockProducts();

	List<Product> findMostExpensiveProductInEachCategory();

}
