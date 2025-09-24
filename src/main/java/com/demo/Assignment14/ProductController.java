package com.SpringBoot.src.main.java.ProductManagementAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping()
    public Product addProduct(@RequestBody Product product) throws ProductNotFoundException, InvalidProductDataException {
        productService.addProduct(product);
        return product;
    }

    @GetMapping()
    public List<Product> getAllProducts() throws ProductNotFoundException {
        return productService.getAllProducts();

    }
}
