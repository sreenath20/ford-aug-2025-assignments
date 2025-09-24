package com.example.product;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private ServiceLayer serviceLayer;

    public ProductController(ServiceLayer serviceLayer) {
        this.serviceLayer = serviceLayer;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) throws InvalidProductDataException {
        return serviceLayer.addProduct(product);
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Integer id) throws ProductNotFoundException {
        return this.serviceLayer.getProduct(id);
    }

    @GetMapping
    public Collection<Product> getAllProducts() throws ProductNotFoundException {
        return this.serviceLayer.getAllProducts();
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Integer id, @RequestBody Product product) throws InvalidProductDataException {
        return this.serviceLayer.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Integer id) throws ProductNotFoundException {
        this.serviceLayer.deleteProduct(id);
    }

    @PatchMapping("/{id}/stock")
    public Product updateProductStock(@PathVariable Integer id, @RequestBody Product product) throws InvalidProductDataException {
        return this.serviceLayer.updateStock(id,product.getStock());
    }


}
