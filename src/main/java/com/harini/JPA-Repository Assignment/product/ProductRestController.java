package com.abc.app.product;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/product")
public class ProductRestController {

    private  final ProductService productService;

    @Autowired
    public ProductRestController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping
    public ElectronicsProduct addNewProduct(@Valid @RequestBody ElectronicsProduct newElectronicsProduct) throws ProductException {
        return this.productService.addNewProduct(newElectronicsProduct);
    }

    @GetMapping("/{id}")
    public ElectronicsProduct getProductById(@PathVariable Integer id) throws ProductException {
        return this.productService.getProductById(id);
    }

    @PatchMapping
    public ElectronicsProduct updateProduct(@RequestBody ElectronicsProduct newElectronicsProduct) throws ProductException {
        return this.productService.updateProductPriceById(newElectronicsProduct.getId(),newElectronicsProduct.getPrice());
    }

    @GetMapping("/all")
    public Collection<ElectronicsProduct> getAllProducts() throws ProductException {
        return this.productService.getAllProducts();
    }

    @GetMapping("/name/{name}")
    public Collection<ElectronicsProduct> getAllProductsByName(@PathVariable String name) throws ProductException {
        return this.productService.getAllProductsByName(name);
    }

    @GetMapping("/price")
    public Collection<ElectronicsProduct> getAllProductsByPrice(@RequestParam Double minPrice,@RequestParam Double maxPrice) throws ProductException {
        return this.productService.getAllProductsByPrice(minPrice,maxPrice);
    }

    @GetMapping("/stock")
    public Collection<ElectronicsProduct> getAllProductsByStock(@RequestParam Integer quantity) throws ProductException {
        return this.productService.getAllProductsByStock(quantity);
    }

    @DeleteMapping("/{id}")
    public ElectronicsProduct deleteProductById(@PathVariable Integer id) throws ProductException {
        return this.productService.deleteProductById(id);
    }


}
