package com.abc.app.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    // save() save new resource / update exiting resource
    // findBuId() returns optional of entity
    // delete(T)
    @Autowired
    // will inject JPARepository bean from spring Data JPA
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ElectronicsProduct addNewProduct(ElectronicsProduct newProduct) throws ProductException {

        return this.productRepository.save(newProduct);
    }

    @Override
    public ElectronicsProduct getProductById(Integer id) throws ProductException {
        Optional<ElectronicsProduct> productOpt = this.productRepository.findById(id);
        if (productOpt.isEmpty())
            throw new ProductException("Product does not exists for id :" + id);

        return productOpt.get();
    }

    @Override
    public ElectronicsProduct updateProductPriceById(Integer id, Double price) throws ProductException {
        Optional<ElectronicsProduct> productOpt = this.productRepository.findById(id);
        if (productOpt.isEmpty())
            throw new ProductException("Product does not exists for id :" + id);
        ElectronicsProduct updateProduct = productOpt.get();
        updateProduct.setPrice(price);
        // check if it gets saved automatically as its a managed object by hibernate
        //Flushes all pending changes to the database.
        // this.productRepository.flush();
        return this.productRepository.save(updateProduct);
    }

    @Override
    public Collection<ElectronicsProduct> getAllProducts() throws ProductException {
        return this.productRepository.findAll();
    }
}
