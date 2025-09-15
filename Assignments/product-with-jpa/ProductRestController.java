package com.demo.product.app;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductRestController {

    private final ProductService productService;

    @Autowired
    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/one")
    @ResponseStatus(HttpStatus.CREATED)
    public Product addNewProduct(@RequestBody @Valid Product newProduct) throws ProductException,Exception {
        return productService.addNewProduct(newProduct);
    }

    @PostMapping("/many")
    @ResponseStatus(HttpStatus.CREATED)
    public String addNewProducts(@RequestBody Collection<Product> newProducts) throws ProductException {
        newProducts.forEach(productService::addNewProduct);
        return "Multiple products added successfully..!";
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Integer id) throws ProductException {
        return productService.getProductById(id);
    }


    @GetMapping("/all")
    public Collection<Product> getAllProducts() throws ProductException {
        return productService.getAllProducts();
    }

    @GetMapping("/{name}")
    public Product getProductByName(@PathVariable("name") String name) throws ProductException {
        return productService.getProductByName(name);
    }

    @GetMapping("/price-btw")
    public Collection<Product> getProductsBetween(@RequestParam Double start, Double end) throws ProductException {
        if(start ==null || end==null || start <=0 || end<=0 )
            throw new ProductException("Price start or end should not be null or price greater than 0");

        return productService.getProductByPriceBetween(start,end);
    }

    @GetMapping("/orderBy/price")
    public Collection<Product> getProductsOrderedByPriceAsc() throws ProductException {
        return productService.getProductsOrderedByPriceAsc();
    }

    @GetMapping("/stock-btw")
    public Collection<Product> getProductsBetweenStock(@RequestParam Integer start, Integer end) throws ProductException {
        if(start ==null || end==null)
            throw new ProductException("The stock start and stock end should not be null");

        return productService.getProductByStockBetween(start,end);
    }

    @GetMapping("/stock/equals")
    Collection<Product> getStockProducts(@RequestParam Integer quantity) throws ProductException {
        return productService.getProductsByStock(quantity);
    }

    @GetMapping("stock/less-than")
    Collection<Product> getStockProductsLessThan(@RequestParam Integer quantity) throws ProductException {
        return productService.getProductsByStockLessThan(quantity);
    }

    @GetMapping("contain/{name}")
    public Collection<Product> getProductsByNameContaining(@PathVariable("name") String name) throws ProductException {
        return productService.getProductsByNameContaining(name);
    }

    @GetMapping("/categories")
    public Collection<Product> getProductsByCategory(@RequestBody List<String> categories) throws ProductException {
        return productService.getProductsByCategories(categories);
    }

    @GetMapping("/{category}/top3/cheap")
    public Collection<Product> getTop3ByCategory(@PathVariable("category") String category) throws ProductException {
        return productService.getTop3ByCategoryOrderByPriceAsc( category);
    }

    @GetMapping("/manufacture/after")
    public Collection<Product> getProductsAfterDate(@RequestParam LocalDate afterDate) throws ProductException {
        return productService.getManufactureDateAfter(afterDate);
    }

    @GetMapping("category/avg-price")
    public Collection<Object[]> getAveragePriceByCategory() throws ProductException {
        return productService.getAveragePriceOfCategory();
    }

    @GetMapping("category/count")
    public Collection<Object[]> getItemsCountCategory() throws ProductException {
        return productService.getItemsCountByCategory();
    }

    @GetMapping("/category/stock-value")
    public Collection<Object[]> getStockValueByCategory() throws ProductException {
        return productService.getStockValueByCategory();
    }

    @GetMapping("/expiration/before")
    public Collection<Product> getProductsBeforeDate(@RequestParam LocalDate beforeDate) throws ProductException {
        return productService.getProductsByExpirationBefore(beforeDate);
    }

    @PatchMapping("/price")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String updateProductPrice(@RequestBody Product productDTO) throws ProductException {
        if(productDTO.getId()==null ||  productDTO.getPrice()==null ||   productDTO.getPrice()<=0)
            throw new ProductException("Product id or price should not be null or price greater than 0");

        return productService.updateProductPriceById(productDTO.getId(), productDTO.getPrice());
    }

    @PatchMapping("price/{category}/{percent}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String updateProductCategoryPrice(@PathVariable("category") String category, @PathVariable("percent") Double percent) throws ProductException {
        return productService.increasePriceByCategory(category, percent);
    }

    @DeleteMapping("/name/{name}")
    public Product deleteProductByName(@PathVariable("name") String name) throws ProductException {
        return productService.deleteProductByName(name);
    }

    @DeleteMapping("/{id}")
    public String deleteProductById(@PathVariable Integer id) throws ProductException {
        return productService.deleteProductById(id);
    }

    @DeleteMapping("/out-of-stock")
    public String deleteProductOutOfStock() throws ProductException {
        return productService.deleteOutOfStockProducts();
    }

}