package com.abc.app.product;

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
    public ElectronicsProduct addNewProduct(@RequestBody ElectronicsProduct newElectronicsProduct) throws ProductException {
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


}
