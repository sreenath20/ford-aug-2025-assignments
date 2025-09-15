package com.demo.product.app;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductDAO productDAO;

    @Autowired
    //    inject JpaRepository bean from Data JPA
    public ProductServiceImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public Product addNewProduct(Product newProduct) throws ProductException {
        //        checking if product exists before adding
        if (productDAO.findById(newProduct.getId()).isPresent()) {
            throw new ProductException("Product already exists for id : " + newProduct.getId());
        }
        return productDAO.save(newProduct);
    }

    @Override
    @Transactional
    public String updateProductPriceById(Integer id, Double price) throws ProductException {
        productDAO.findById(id).orElseThrow(() -> new ProductException("Product not exists for id : " + id));

        int updated = productDAO.updateProductPrice(id, price);
        if (updated != 1) throw new ProductException("Product price not updated for id : " + id);
        return "Product price updated for id : " + id + "price: " + price;
    }

    @Override
    public Collection<Product> getAllProducts() {
        //        retrieving all products
        Collection<Product> products = productDAO.findAll();
        if (products.isEmpty())
            throw new ProductException("No products found in the database");
        return products;
    }

    @Override
    public Product getProductById(Integer id) throws ProductException {
        //        retrieving product by id
        Optional<Product> optionalProduct = productDAO.findById(id);
        if (optionalProduct.isEmpty())
            throw new ProductException("Product not exist for id: " + id);

        return optionalProduct.get();
    }

    @Override
    public Product getProductByName(String name) throws ProductException {
        Optional<Product> optionalProduct = productDAO.findByName(name);
        if (optionalProduct.isEmpty()) {
            throw new ProductException("Product not found for name: " + name);
        }
        return optionalProduct.get();
    }

    @Override
    @Transactional
    public String deleteProductById(Integer id) throws ProductException {

        if(productDAO.findById(id).isEmpty())
            throw new ProductException("Product not exists to delete for id: " + id);

//        deleting product by id
        productDAO.deleteById(id);
        return "Deleted product successfully with id: " + id;
    }

    @Override
    public Collection<Product> getProductByPriceBetween(Double priceStart, Double priceEnd) throws ProductException {

        Collection<Product> productsPriceBtw = productDAO.findByPriceBetween(priceStart, priceEnd);
        if (productsPriceBtw.isEmpty())
            throw new ProductException("Product not found for price between " + priceStart + " and " + priceEnd);
        return productsPriceBtw;
    }

    @Override
    public Collection<Product> getProductByStockBetween(Integer stockStart, Integer stockEnd) throws ProductException {
        Collection<Product> productsStockBtw = productDAO.findByStockBetween(stockStart, stockEnd);
        if (productsStockBtw.isEmpty())
            throw new ProductException("Product not found for stock between " + stockStart + " and " + stockEnd);
        return productsStockBtw;
    }

    @Override
    public Collection<Product> getProductsByStock(Integer quantity) throws ProductException {
        Collection<Product> productsStock = productDAO.findByStockEquals( quantity);
        if (productsStock.isEmpty())
            throw new ProductException("No products found for stock quantity: " + quantity);
        return productsStock;
    }

    @Override
    public Collection<Product> getProductsByStockLessThan(Integer quantity) throws ProductException {
        return productDAO.findByStockLessThan(quantity);
    }

    @Override
    public Collection<Product> getProductsByExpirationBefore(LocalDate expirationDate) throws ProductException {
        return productDAO.findByExpirationDateBefore(expirationDate);
    }



    @Override
    public Collection<Product> getProductsOrderedByPriceAsc() {
        Collection<Product> productsPriceOrd = productDAO.findByOrderByPriceAsc();
        if (productsPriceOrd.isEmpty())
            throw new ProductException("There is no products in the database.");
        return productsPriceOrd;
    }

    @Override
    public Collection<Product> getProductsByNameContaining(String name) throws ProductException {
        Collection<Product> productsNameContaining = productDAO.findByNameContainingIgnoreCase(name);
        if (productsNameContaining.isEmpty())
            throw new ProductException("Products not found for name containing: " + name);
        return productsNameContaining;
    }

    @Override
    public Collection<Product> getProductsByCategories(List<String> categories) throws ProductException {
        Collection<Product> productsCategory = productDAO.findByCategoryIn(categories);
        if (productsCategory.isEmpty())
            throw new ProductException("Product not found to delete for category: " + categories);
        return productsCategory;
    }

    @Override
    public Collection<Product> getTop3ByCategoryOrderByPriceAsc(String category) throws ProductException {
        Collection<Product> products = productDAO.findTop3ByCategoryOrderByPriceAsc(category);
        if(products.isEmpty())
            throw new ProductException("Product not found to delete for category: " + category);
        return products;
    }

    @Override
    public Collection<Product> getManufactureDateAfter(LocalDate manufactureDate) throws ProductException {
        Collection<Product> products =  productDAO.findByManufactureDateAfter(manufactureDate);
        if(products.isEmpty())
            throw new ProductException("Product not found  for manufacture date after : " + manufactureDate);
        return products;
    }

    @Override
    public List<Object[]> getAveragePriceOfCategory() throws ProductException {
        return productDAO.findAveragePriceByCategory();
    }

    @Override
    public List<Object[]> getItemsCountByCategory() throws ProductException {
        return productDAO.findMostPopularCategory();
    }

    @Override
    public List<Object[]> getStockValueByCategory() throws ProductException {
        return productDAO.calculateStockValueByCategory();
    }

    @Override
    @Transactional
    public String increasePriceByCategory(String category,Double percent) throws ProductException {
        double percentage = (percent/100)+1;
        int updated = productDAO.increasePriceByCategory(category,percentage);
        if(updated <= 0) throw new ProductException("Products price not updated for category : " + category);
        return updated + "Product price updated for category : " + category;
    }


    @Override
    @Transactional
    public Product deleteProductByName(String name) throws ProductException {
        Optional<Product>  optionalProduct = productDAO.findByName(name);
        if (optionalProduct.isEmpty())
            throw new ProductException("Product not found to delete for name: " + name);
        productDAO.deleteByName(name);
        return optionalProduct.get();
    }

    @Override
    @Transactional
    public String deleteOutOfStockProducts() throws ProductException {
        int deleted = productDAO.deleteOutOfStockProducts();
        if(deleted <= 0)
            throw new ProductException("Product not found to delete out of stock");
        return deleted + " Product deleted out of stock";
    }

}

