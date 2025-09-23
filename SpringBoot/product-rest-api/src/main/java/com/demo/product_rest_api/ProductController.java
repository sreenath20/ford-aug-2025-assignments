package com.demo.product_rest_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/products")  
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping  
    public Product addProduct(@RequestBody Product newProduct) {
        return productService.addProduct(newProduct);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Integer productId) {
        return productService.getProductById(productId);
    }

    @GetMapping  
    public Collection<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Integer productId, @RequestBody Product product) {
        return productService.updateProduct(productId, product);
    }

    @PatchMapping("/{id}/stock")  
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
