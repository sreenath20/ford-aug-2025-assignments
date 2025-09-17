package com.example.productcustomjpa;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductRestController {

    private final ProductService productService;

    @Autowired
    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String welcome() {
        return "Welcome to the product rest API!";
    }

    @PostMapping
    public Product addNewProduct(@Valid @RequestBody Product product) throws ProductException {
        return this.productService.addNewProduct(product);
    }

    @GetMapping("/price")
    public List<Product> getProductsPriceBetween(@Valid @RequestParam Double min, @Valid @RequestParam Double max) {
        return this.productService.findByPriceBetween(min,max);
    }

    @GetMapping("/name/{productname}")
    public List<Product> getProductsName(@PathVariable String productname) {
        return this.productService.findByNameContainingIgnoreCase(productname);
    }

    @GetMapping("/categories")
    public List<Product> getProductsCategories(@RequestParam List<String> categories) {
        return this.productService.findByCategoryIn(categories);
    }

    @GetMapping("/categorycheapest")
    public List<Product> getProductsCategoryCheapest(@RequestParam String category) {
        return this.productService.findTop3ByCategoryOrderByPriceAsc(category);
    }

    @GetMapping("/createdafter")
    public List<Product> getProductsCreatedAfter(@RequestParam LocalDate date) {
        return this.productService.findByCreatedDateAfter(date);
    }

    @GetMapping("/avgpricebycategory")
    public List<Object[]> getProductsAvgPriceByCategory() {
        return this.productService.findAveragePriceByCategory();
    }

    @GetMapping("/mostpopularcategory")
    public List<Object[]> getProductsMostPopularCategory() {
        return this.productService.findMostPopularCategory();
    }

    @GetMapping("/stockvaluebycatregory")
    public List<Object[]> getProductsStockValueByCategory() {
        return this.productService.calculateStockValueByCategory();
    }

    @GetMapping("/outofstockproducts")
    public List<Product> getProductsOutOfStock() {
        return this.productService.findByStockEquals(0);
    }

    @GetMapping("/stocklessthan/{stock}")
    public List<Product> getProductsStockLessThan(@PathVariable Integer stock) {
        return this.productService.findByStockLessThan(stock);
    }

    @GetMapping("expirydatebefore/{date}")
    public List<Product> getProductsExpiryDateBefore(@PathVariable LocalDate date) {
        return this.productService.findByExpiryDateBefore(date);
    }

    @PatchMapping("/increasepricebycategory/{category}")
    public int increasePriceByCategory(@Valid @PathVariable String category) {
        return this.productService.increasePriceByCategory(category);
    }

    @DeleteMapping("/outofstockproducts")
    public int deleteOutOfStockProducts() {
        return this.productService.deleteOutOfStockProducts();
    }

    @GetMapping("/mostexpensiveproductbycategory")
    public List<Product> getProductsMostExpensiveProductByCategory() {
        return this.productService.findMostExpensiveProductInEachCategory();
    }

}
