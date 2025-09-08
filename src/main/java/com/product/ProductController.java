package com.example.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String homepage(){
        return "Welcome to PRODUCT MANAGEMENT API";
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product newProduct) throws InvalidProductDataException {
        try{
            return productService.addProduct(newProduct);
        }
        catch(InvalidProductDataException e){
            throw e;
        }
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable Integer id) throws ProductNotFoundException {
        try{
            return productService.getProductById(id);
        }
        catch(ProductNotFoundException e){
            throw e;
        }
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PutMapping("/products/{id}")
    public Product updateProduct(@PathVariable Integer id, @RequestBody Product updatedProduct) throws ProductNotFoundException,InvalidProductDataException {
        try{
            return productService.updateProduct(id, updatedProduct);
        }
        catch(InvalidProductDataException e){
            throw e;
        }
        catch(ProductNotFoundException e){
            throw e;
        }
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PatchMapping("/products/{id}/{stock}")
    public Product updateStock(@PathVariable Integer id, @PathVariable Integer stock) throws ProductNotFoundException, InvalidProductDataException {
        try{
            return productService.updateStock(id, stock);
        }
        catch(InvalidProductDataException e){
            throw e;
        }
        catch(ProductNotFoundException e){
            throw e;
        }
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @DeleteMapping("products/{id}")
    public Product deleteProduct(@PathVariable Integer id) throws ProductNotFoundException {
        try{
            return productService.deleteProduct(id);
        }
        catch(ProductNotFoundException e){
            throw e;
        }
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping("/products/search")
    public List<Product> searchProductsByName(@RequestParam String name){
        return productService.searchProductsByName(name);
    }

}
