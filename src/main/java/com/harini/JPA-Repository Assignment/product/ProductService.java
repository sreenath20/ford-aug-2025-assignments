package com.abc.app.product;

import java.util.Collection;

//@Service
public interface ProductService {

    ElectronicsProduct addNewProduct(ElectronicsProduct newElectronicsProduct) throws ProductException;

    ElectronicsProduct getProductById(Integer id) throws ProductException;

    ElectronicsProduct updateProductPriceById(Integer id, Double price) throws ProductException;

    Collection<ElectronicsProduct> getAllProducts() throws ProductException;

    Collection<ElectronicsProduct> getAllProductsByName(String name) throws ProductException;

    Collection<ElectronicsProduct> getAllProductsByPrice(Double minPrice,Double maxPrice) throws ProductException;

    Collection<ElectronicsProduct> getAllProductsByStock(Integer stock) throws ProductException;

    ElectronicsProduct deleteProductById(Integer id) throws ProductException;
}
