package com.product_management.product;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {


    private final ProductService productService;

    @Autowired
    public ProductController (ProductService productService) {
        this.productService=productService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Product addProduct(@Valid @RequestBody Product product) throws InvalidProductDataException {
        productService.addProduct(product);
        return product;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    Product getProductById(@PathVariable ("id")Integer id) throws ProductNotFoundException {
        return productService.getProductById(id);


    }
    @GetMapping("/name/{name}")
    @ResponseStatus(HttpStatus.OK)
    Collection<Product> getProductByName(@PathVariable ("name")String name)  {
    return productService.searchProductsByName(name);
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    Collection<Product> getAllProducts() throws ProductNotFoundException {
        return productService.getAllProducts();
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    Product updateProduct(@RequestBody Product product) throws  InvalidProductDataException {
        return productService.updateProduct(product.getId(),product);

    }

    @PatchMapping("/{id}/{stock}")
    @ResponseStatus(HttpStatus.OK)
    Product updateStock(@PathVariable ("id") Integer id,@PathVariable ("stock") Integer stock) throws InvalidProductDataException {
      return productService.updateStock(id,stock);
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    Product deleteProduct(@PathVariable ("id")Integer id) throws ProductNotFoundException {
        return productService.deleteProduct(id);
    }

    @GetMapping("startPrice/{startPrice}/endPrice/{endPrice}")
    @ResponseStatus(HttpStatus.OK)
    Collection<Product> getProductBetweenPrice(@PathVariable("startPrice") Double endPrice, @PathVariable ("endPrice") Double startPrice) {
        return productService.searchProductsByPriceBetween(endPrice, startPrice);
    }

    @GetMapping("/stock/{stock}")
    @ResponseStatus(HttpStatus.OK)
    Collection<Product> getProductByStock(@PathVariable("stock") Integer stock) {
        return productService.searchProductsByStockLessThan(stock);
    }

    @GetMapping("/price/{price}")
    @ResponseStatus(HttpStatus.OK)
    Collection<Product> getProductByPrice(@PathVariable("price") Double price) {
        return productService.findProductByPrice(price);
    }


    @GetMapping("/case/{name}")
    @ResponseStatus(HttpStatus.OK)
    Collection<Product> searchProductByNameCaseInsensitive(@PathVariable("name") String name){
        return productService.searchProductsByNameCaseInSensitive(name);
    }

    // sorting and ranking
    @GetMapping("/category")
    @ResponseStatus(HttpStatus.OK)
    Collection<Product> searchTop3ByCategoryOrderByPriceAsc(@RequestParam( value="category") String category){
        return productService.findProductTop3CategoryOrderByPriceAsc(category);
    }

    @GetMapping("/newest")
    @ResponseStatus(HttpStatus.OK)
    Collection<Product> getNewestProductsAddedLastWeek(){
        return productService.findNewestProductsLastWeek();

    }

    @GetMapping("/afterDate")
    @ResponseStatus(HttpStatus.OK)
    Collection<Product> getAfterDate(
            @RequestParam ("date")
           LocalDate date){
        return productService.findProductByDateAfter(date);

    }

// @DateTimeFormat(iso =DateTimeFormat.ISO.DATE) 


    // find avg per category
    @GetMapping("/averageprice")
    @ResponseStatus(HttpStatus.OK)
    List<Object[]> getAveragePrice(@RequestParam ("category")
                                        String category) {
        return productService.findAveragePriceByCategory(category);

    }

    // category with maximum number of products
    @GetMapping("/mostpopular")
    @ResponseStatus(HttpStatus.OK)
    List<Object[]> findMostPopularCategory(){
            return productService.findMostPopularByCategory();
    }

    //total stock value per category
    @GetMapping("/stockvalue")
    @ResponseStatus(HttpStatus.OK)
    List<Object[]> calculateStockValueByCategory(){
        return productService.findStockValueByCategory();
    }

    // Find out-of-stock products
    @GetMapping("/findStock")
    @ResponseStatus(HttpStatus.OK)
    List<Product> findByStockEquals(@RequestParam ("stock") Integer stock){
        return productService.findByStockEqual(stock);
    }

    @GetMapping("/findStockLessThan")
    @ResponseStatus(HttpStatus.OK)
    List<Product> findByStockLessThan(@RequestParam ("stock") Integer stock){
        return productService.findByStockLessThan(stock);
    }

    // update & delete
    @PutMapping("/IncreasePrice")
    @ResponseStatus(HttpStatus.OK)
    @Transactional
    int updateProductPriceByCategory(@RequestParam("category") String category) {
        return productService.updateProductPriceByCategory(category);
    }

    @DeleteMapping("/deleteStock")
    @ResponseStatus(HttpStatus.OK)
    @Transactional
    int deleteProductByStockLessThan(@RequestParam ("stock") Integer stock){
        return productService.deleteProductByStockCount(stock);
    }

    //. Advanced Queries
    // most expensive in each category
    @GetMapping("/mostExpensive")
    @ResponseStatus(HttpStatus.OK)
    List<Product> findMostExpensiveProductsInEachCategory(){
        return productService.findMostExpensiveProductInEachCategory();
    }

    //pagination

    @GetMapping("/pageProduct")
    @ResponseStatus(HttpStatus.OK)
    Page<Product>findByCategory(@RequestParam ("category")  String category,  Pageable pageable){
        return productService.findByCategory(category, pageable);
    }

}














