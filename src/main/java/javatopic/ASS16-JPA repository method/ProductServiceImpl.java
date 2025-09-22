package com.product_management.product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class ProductServiceImpl implements ProductService {
    private final Map<Integer,Product> productRepo=new HashMap<>();

    @Autowired
    // will inject JPARepository bean from Data JPA
    // hibernate people create a particular bean instead of we create it
    //
    private final ProductDao productDao;
    public ProductServiceImpl(ProductDao productDao) {
        this.productDao=productDao;
    }
    
    
    // with map for storing the data
    
    @Override
    public Product addProduct(Product product) throws InvalidProductDataException {
        try{
            if(productRepo.containsKey(product.getId())) {
                throw new InvalidProductDataException("product already exists!");
            }
            else{
                productRepo.put(product.getId(), product);
            }
        }
        catch(InvalidProductDataException e){
            throw e;

        }
        productRepo.put(product.getId(),product);
        return product;
    }

    @Override
    public Product getProductById(Integer id) throws ProductNotFoundException {
        try{
            if(productRepo.containsKey(id)) {
                return productRepo.get(id);
            }
            else{
                throw new ProductNotFoundException("product not found in Map!");

            }
        }
        catch(ProductNotFoundException e){
            throw e;
        }



    }

    @Override
    public Collection<Product> getAllProducts() throws ProductNotFoundException {
        try{
            if(productRepo.isEmpty()) {
                throw new ProductNotFoundException("products not found,MAP is empty!");
            }
            else{
                return productRepo.values();
            }
        }
        catch(ProductNotFoundException e){
            throw e;
        }

    }

    @Override
    public Product updateProduct(Integer id, Product product) throws InvalidProductDataException {
        try{
            if(productRepo.containsKey(id)) {
                productRepo.put(id, product);
                return productRepo.get(id);
            }
            else{
                throw new InvalidProductDataException("product not found in Map!");
            }
        }
        catch(InvalidProductDataException e){
            throw e;
        }

    }

    @Override
    public Product updateStock(Integer id, Integer stock) throws InvalidProductDataException {

        if(productRepo.containsKey(id)) {
            productRepo.get(id).setStock(stock);
            return productRepo.get(id);
        }
        else{
            throw new InvalidProductDataException("product not found in map");
        }

    }

    @Override
    public Product deleteProduct(Integer id) throws ProductNotFoundException {
        if(productRepo.containsKey(id)) {
            return productRepo.remove(id);
        }
        else{
            throw new ProductNotFoundException("can not delete product not in map");
        }

    }

    @Override
    public Product searchProductsByName(String keyword) {
        return  null;
    }
    
    //with jpa repository for storing the data

//    @Override
//    public Product addProduct(Product product) throws InvalidProductDataException {
//        return this.productDao.save(product);
//    }
//
//    @Override
//    public Product getProductById(Integer id) throws ProductNotFoundException {
//        Optional<Product> productOpt= this.productDao.findById(id);
//        if (productOpt.isEmpty()) {
//            throw new ProductNotFoundException("Product not found");
//        }
//        return productOpt.get();
//
//    }
//
//    @Override
//    public Collection<Product> getAllProducts() throws ProductNotFoundException {
//        return this.productDao.findAll();
//        // findall gives the list of all product
//    }
//
//    @Override
//    public Product updateProduct(Integer id, Product product) throws InvalidProductDataException {
//        Optional<Product> productOpt= this.productDao.findById(id);
//        if (productOpt.isEmpty()) {
//            throw new InvalidProductDataException("Product not found");
//        }
//        Product updatedProduct=productOpt.get();
//        updatedProduct.setName(product.getName());
//        updatedProduct.setPrice(product.getPrice());
//        updatedProduct.setStock(product.getStock());
//        return this.productDao.save(updatedProduct); // can save it or flush it to persist the data to db
//        // the change which are made that can saved to db by flush
//        //this.productDao.flush()
//
//    }
//
//    @Override
//    public Product updateStock(Integer id, Integer stock) throws InvalidProductDataException {
//        Optional<Product> productOpt= this.productDao.findById(id);
//        if (productOpt.isEmpty()) {
//            throw new InvalidProductDataException("Product not found");
//        }
//        Product updatedProduct=productOpt.get();
//        updatedProduct.setStock(stock);
//        return this.productDao.save(updatedProduct);
//    }
//
//    @Override
//    public Product deleteProduct(Integer id) throws ProductNotFoundException {
//       Optional<Product> productOpt= this.productDao.findById(id);
//       if (productOpt.isEmpty()) {
//           throw new ProductNotFoundException("Product not found");
//       }
//       Product deletedProduct=productOpt.get();
//       this.productDao.delete(deletedProduct);
//       return deletedProduct;
//    }
//
//    @Override
//    public Collection<Product> searchProductsByName(String name) {
//        return this.productDao.findByName(name);
//    }
//
//    @Override
//    public Collection<Product> searchProductsByPriceBetween(Double priceBefore, Double priceAfter) {
//        return this.productDao.findProductByPriceBetween(priceBefore,priceAfter);
//    }
//
//    @Override
//    public Collection<Product> searchProductsByStockLessThan(Integer stock) {
//        return this.productDao.findByStockLessThan(stock);
//
//    }
//
//    @Override
//    public Collection<Product> findProductByPrice(Double price) {
//        return this.productDao.findByPriceEquals(price);
//    }
//
//    @Override
//    public Collection<Product> searchProductsByNameCaseInSensitive(String name) {
//       return this.productDao.findByNameIgnoreCase(name);
//    }
//
//    @Override
//    public Collection<Product> findProductTop3CategoryOrderByPriceAsc(String category) {
//        return this.productDao.findByCategoryContaining(category);
//    }
//
//    @Override
//    public Collection<Product> findNewestProductsLastWeek() {
//        return this.productDao.findByManufactureDateContaining();
//    }
//
//    @Override
//    public Collection<Product> findProductByDateAfter(LocalDate date) {
//        return this.productDao.findByManufactureDateAfter(date);
//    }
//
//    @Override
//    public List<Object[]> findAveragePriceByCategory(String category) {
//        return this.productDao.findByCategoryAveragePrice(category);
//    }
//
//    @Override
//    public List<Object[]> findMostPopularByCategory() {
//        return this.productDao.findPopularProductsByCategory();
//    }
//
//    @Override
//    public List<Object[]> findStockValueByCategory() {
//        return this.productDao.findStockValueByCategory();
//    }
//
//    @Override
//    public List<Product> findByStockEqual(Integer stock) {
//        return this.productDao.findByStockEquals(stock);
//    }
//
//    @Override
//    public List<Product> findByStockLessThan(Integer stock) {
//        return this.productDao.findByStockLessThan(stock);
//    }
//
//
//
//
//    @Override
//    public int updateProductPriceByCategory(String category) {
//        return this.productDao.updateProductByPriceContaining(category);
//    }
//
//    @Override
//    public Collection<Product> updateProductPriceByCategory() {
//        return List.of();
//    }
//
//    @Override
//    public int deleteProductByStockCount(Integer stock) {
//        return this.productDao.deleteProductByStockEquals(stock);
//    }
//
//    @Override
//    public List<Product> findMostExpensiveProductInEachCategory() {
//        return this.productDao.findMostExpensiveProductInEachCategory();
//    }
//
//    @Override
//    public Page<Product> findByCategory(String category, Pageable pageable) {
//        return this.productDao.findByCategory(category,pageable);
//    }


}
