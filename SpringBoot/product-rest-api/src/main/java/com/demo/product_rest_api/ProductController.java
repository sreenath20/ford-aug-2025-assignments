package com.demo.product_rest_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/products")  // ← Changed from "api/product" to "/products"
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping  // ← Changed from "/add" to ""
    public Product addProduct(@RequestBody Product newProduct) {
        return productService.addProduct(newProduct);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Integer productId) {
        return productService.getProductById(productId);
    }

    @GetMapping  // ← Changed from "/all" to ""
    public Collection<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Integer productId, @RequestBody Product product) {
        return productService.updateProduct(productId, product);
    }

    @PatchMapping("/{id}/stock")  // ← NEW: Stock update endpoint
    public Product updateStock(@PathVariable("id") Integer productId, @RequestBody Product product) {
        return productService.updateStock(productId, product.getStock());
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable("id") Integer productId) {
        return productService.deleteProduct(productId);
    }

    @GetMapping("/search")
    public Product searchProducts(@RequestParam("name") String keyword) {
        return productService.searchProductsByName(keyword);
    }
}
