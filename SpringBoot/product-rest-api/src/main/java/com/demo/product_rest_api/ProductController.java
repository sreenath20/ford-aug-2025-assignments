package com.demo.product_rest_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public Product addNewProduct(@RequestBody Product newProduct) {
        try {
            return productService.addNewProduct(newProduct);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @PostMapping("add/products")
    public String addMultipleProducts(@RequestBody Collection<Product> newProducts) {
        newProducts.forEach(product -> productService.addNewProduct(product));
        return "Multiple Products added successfully";
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
        product.setProductId(productId);
        try {
            return productService.updateProduct(product);
        } catch (ProductException e) {
            throw new RuntimeException(e);
        }
    }

    @PatchMapping("/{id}/name")
    public Product updateProductName(@PathVariable("id") Integer productId, @RequestParam("name") String newName) {
        Product foundProduct = productService.getProductById(productId);
        foundProduct.setProductName(newName);
        return productService.updateProduct(foundProduct);
    }

    @PatchMapping("/{id}/price")
    public String updateProductPrice(@PathVariable("id") Integer productId, @RequestParam("price") Double newPrice) {
        return productService.updateProductPrice(productId, newPrice);
    }

    @GetMapping("/sort/order/{order}")
    public Collection<Product> getProductByOrder(@PathVariable("order") String sortOrder) {
        return productService.sortProducts(sortOrder);
    }

    @GetMapping("/find/products/name/{name}")
    public Collection<Product> getProductsByName(@PathVariable("name") String productName) {
        return productService.findProductsByName(productName);
    }

    @GetMapping("/get/products/price/between")
    public Collection<Product> getProductByBetween(@RequestParam("fromPrice") Double startPrice,
                                                   @RequestParam("toPrice") Double endPrice) {
        return productService.findAllProductsHavingPriceBetween(startPrice, endPrice);
    }

    @DeleteMapping("/{id}")
    public String deleteProductById(@PathVariable("id") Integer productId) {
        return productService.deleteProductById(productId);
    }
}
