package com.abc.app.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImp implements ProductService{

    private final ProductRepository productRepository;

    @Autowired
    //will inject JPARepository bean from Data JPA
    public ProductServiceImp (ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public ElectronicsProduct addNewProduct(ElectronicsProduct newElectronicsProduct) throws ProductException {
        return this.productRepository.save(newElectronicsProduct);
    }

    @Override
    public ElectronicsProduct getProductById(Integer id) throws ProductException {
        Optional<ElectronicsProduct> productOpt = this.productRepository.findById(id);
        if(productOpt.isEmpty()){
            throw new ProductException("Product does not exist for this id: "+id);

        }
        return productOpt.get();
    }

    @Override
    public ElectronicsProduct updateProductPriceById(Integer id, Double price) throws ProductException {
        Optional<ElectronicsProduct> productOpt = this.productRepository.findById(id);
        if(productOpt.isEmpty()){
            throw new ProductException("Product does not exist for this id: "+id);

        }
        ElectronicsProduct updateProduct = productOpt.get();
        updateProduct.setPrice(price);
        // by doing so the updation is saved in the db also
        this.productRepository.flush();
        //this.productRepository.save(updateProduct);
        return updateProduct;
    }

    @Override
    public Collection<ElectronicsProduct> getAllProducts() throws ProductException {

        return this.productRepository.findAll();
    }
}
