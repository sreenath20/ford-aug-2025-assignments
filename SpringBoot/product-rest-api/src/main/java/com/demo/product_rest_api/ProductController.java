package com.demo.product_rest_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("api/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/add")
    public Product addNewProduct(@RequestBody Product newProduct) {
        return productService.addNewProduct(newProduct);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Integer productId) {
        return productService.getProductById(productId);
    }

    @GetMapping("/all")
    public Collection<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Integer productId, @RequestBody Product product) {
        return productService.updateProduct(productId, product);
    }

    @PatchMapping("/{id}/name")
    public Product updateProductName(@PathVariable("id") Integer productId, @RequestParam("name") String newName) {
        return productService.updateProductName(productId, newName);
    }

    @PatchMapping("/{id}/price")
    public String updateProductPrice(@PathVariable("id") Integer productId, @RequestParam("price") Double newPrice) {
        return productService.updateProductPrice(productId, newPrice);
    }

    @GetMapping("/search")
    public Product getProductByName(@RequestParam("name") String productName) {
        return productService.searchProductByName(productName);
    }

    @DeleteMapping("/{id}")
    public String deleteProductById(@PathVariable("id") Integer productId) {
        return productService.deleteProductById(productId);
    }
}
