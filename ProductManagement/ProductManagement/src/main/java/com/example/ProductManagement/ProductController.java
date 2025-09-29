package com.example.ProductManagement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    //DI
    @Autowired
    public ProductController(ProductService productService) {

        this.productService = productService;
    }

    //addProd
    @PostMapping
    public Product addProduct(@RequestBody Product product) {

        return productService.addNewProduct(product);
    }

    //getProd from db
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Integer id) {

        return productService.getProductById(id);
    }

    @GetMapping("/all")
    public Collection<Product> getAllProducts() {

        return productService.getAllProducts();
    }

    //Update prod using ID
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Integer id, @RequestBody Product product) {
        return productService.updateProduct(id,product);
    }


    @PatchMapping("/{id}/stock")
    public Product updateProductStock(@PathVariable("id") Integer id, @RequestBody Product product) {
        return productService.updateStockById(id,product.getStock());
    }
    //delete prod
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Integer id) {
        return  productService.deleteProductById(id);
    }
//get prod using name
    @GetMapping("/search")
    public Product getProductByName(@RequestParam("name") String name) {
        return productService.searchProductByName(name);
    }

}
