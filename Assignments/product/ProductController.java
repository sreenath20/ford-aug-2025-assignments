package com.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addNewProduct(product);
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Integer id) {
        return productService.getProductById(id);
    }

    @GetMapping("/all")
    public Collection<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Integer id, @RequestBody Product product) {
        return productService.updateProduct(id,product);
    }

    @PatchMapping("/{id}/stock")
    public Product updateProductStock(@PathVariable("id") Integer id, @RequestBody Product product) {
        return productService.updateStockById(id,product.getStock());
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Integer id) {
        return  productService.deleteProductById(id);
    }

    @GetMapping("/search")
    public Product getProductByName(@RequestParam("name") String name) {
        return productService.searchProductByName(name);
    }
}
