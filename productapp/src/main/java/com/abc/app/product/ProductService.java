package com.abc.app.product;

import java.util.Collection;

//@Service
public interface ProductService {

    ElectronicsProduct addNewProduct(ElectronicsProduct newElectronicsProduct) throws ProductException;

    ElectronicsProduct getProductById(Integer id) throws ProductException;

    ElectronicsProduct updateProductPriceById(Integer id, Double price) throws ProductException;

    Collection<ElectronicsProduct> getAllProducts() throws ProductException;
}
