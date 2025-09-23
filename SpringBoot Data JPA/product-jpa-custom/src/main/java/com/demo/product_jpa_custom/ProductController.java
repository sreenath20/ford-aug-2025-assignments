package com.demo.product_jpa_custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

	private final ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}

	@GetMapping("/{id}")
	public Product getProductById(@PathVariable Integer id) {
		return productService.getProductById(id);
	}

	@GetMapping
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable Integer id, @RequestBody Product product) {
		return productService.updateProduct(id, product);
	}

	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable Integer id) {
		return productService.deleteProduct(id);
	}

	@GetMapping("/name/{name}")
	public Product getProductByName(@PathVariable String name) {
		return productService.getProductByName(name);
	}

	@GetMapping("/price-range")
	public List<Product> findByPriceBetween(@RequestParam Double min, @RequestParam Double max) {
		return productService.findByPriceBetween(min, max);
	}

	@GetMapping("/search")
	public List<Product> findByNameContaining(@RequestParam String keyword) {
		return productService.findByNameContaining(keyword);
	}

	@GetMapping("/categories")
	public List<Product> findByCategoryIn(@RequestParam List<String> categories) {
		return productService.findByCategoryIn(categories);
	}

	@GetMapping("/top3/{category}")
	public List<Product> findTop3ByCategoryOrderByPriceAsc(@PathVariable String category) {
		return productService.findTop3ByCategoryOrderByPriceAsc(category);
	}

	@GetMapping("/created-after")
	public List<Product> findByCreatedDateAfter(@RequestParam LocalDate date) {
		return productService.findByCreatedDateAfter(date);
	}

	@GetMapping("/avg-price-by-category")
	public List<Object[]> findAveragePriceByCategory() {
		return productService.findAveragePriceByCategory();
	}

	@GetMapping("/popular-category")
	public List<Object[]> findMostPopularCategory() {
		return productService.findMostPopularCategory();
	}

	@GetMapping("/stock-value-by-category")
	public List<Object[]> calculateStockValueByCategory() {
		return productService.calculateStockValueByCategory();
	}

	@GetMapping("/out-of-stock")
	public List<Product> findOutOfStockProducts() {
		return productService.findOutOfStockProducts();
	}

	@GetMapping("/low-stock")
	public List<Product> findLowStockProducts() {
		return productService.findLowStockProducts();
	}

	@GetMapping("/expiring-before")
	public List<Product> findByExpiryDateBefore(@RequestParam LocalDate date) {
		return productService.findByExpiryDateBefore(date);
	}

	@PatchMapping("/increase-price/{category}")
	public String increasePriceByCategory(@PathVariable String category) {
		int updated = productService.increasePriceByCategory(category);
		return "Updated " + updated + " products in category: " + category;
	}

	@DeleteMapping("/out-of-stock")
	public String deleteOutOfStockProducts() {
		int deleted = productService.deleteOutOfStockProducts();
		return "Deleted " + deleted + " out-of-stock products";
	}

	@GetMapping("/most-expensive-by-category")
	public List<Product> findMostExpensiveProductInEachCategory() {
		return productService.findMostExpensiveProductInEachCategory();
	}

}
