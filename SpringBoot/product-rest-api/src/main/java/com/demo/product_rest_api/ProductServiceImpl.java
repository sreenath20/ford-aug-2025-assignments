package com.demo.product_rest_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

    @Override
    public Product addNewProduct(Product newProduct) throws ProductException {

        try {
            Product foundProduct = productDAO.getProductById(newProduct.getProductId());
            if (foundProduct != null) {
                throw new ProductException("This product has already been registered with id : " + newProduct.getProductId());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        productDAO.saveProduct(newProduct);

        return newProduct;
    }

    @Override
    public Product getProductById(Integer productId) throws ProductException {
        Product foundProduct = productDAO.getProductById(productId);
        if (foundProduct == null) {
            throw new ProductException("Product not found for id : " + productId);
        }
        return foundProduct;
    }

    @Override
    public Collection<Product> getAllProducts() throws ProductException {

        Collection<Product> products = productDAO.getAllProducts();
        return products;
    }

    @Override
    public Product updateProduct(Product product) throws ProductException {
        Product foundProduct = productDAO.getProductById(product.getProductId());
        if (foundProduct == null) {
            throw new ProductException("Product not found for id : " + product.getProductId());
        } else {
            productDAO.updateProduct(product);
        }
        return product;
    }

    @Override
    public Collection<Product> sortProducts(String sortOrder) throws ProductException {

        Comparator<Product> productComparator;
        List<Product> products = (List<Product>) productDAO.getAllProducts();
        if (products == null) {
            throw new ProductException("No products found.");
        }
        switch (sortOrder) {
            case "name":
                productComparator = (p1, p2) -> p1.getProductName().compareTo(p2.getProductName());
                break;
            case "price":
                productComparator = (p1, p2) -> p1.getProductPrice().compareTo(p2.getProductPrice());
                break;
            case "quantity":
                productComparator = (p1, p2) -> p1.getQuantity().compareTo(p2.getQuantity());
                break;
            case "id":
                productComparator = (p1, p2) -> p1.getProductId().compareTo(p2.getProductId());
                break;
            default:
                throw new ProductException("Invalid order use[name,id,price,quantity]");
        }
        products.sort(productComparator);
        return products;
    }

    @Override
    public Collection<Product> findProductsByName(String productName) throws ProductException {
        Collection<Product> products = productDAO.getProductByName(productName);
        if (products.isEmpty()) {
            throw new ProductException("No products found for name : " + productName);
        }
        return products;
    }

    @Override
    public Collection<Product> findAllProductsHavingPriceBetween(Double startPrice, Double endPrice) throws ProductException {

        List<Product> products = (List<Product>) productDAO.findAllProductsHavingPriceBetween(startPrice, endPrice);
        if (products.isEmpty()) {
            throw new ProductException("No products found for price between : " + startPrice + " and " + endPrice);
        }
        return products;
    }

    @Override
    public String updateProductPrice(Integer productId, Double updatedPrice) throws ProductException {
        Product foundProduct = productDAO.getProductById(productId);
        if (foundProduct == null) {
            throw new ProductException("Product not found for id : " + productId);
        } else {
            foundProduct.setProductPrice(updatedPrice);
            productDAO.updatePrice(foundProduct, updatedPrice);
        }
        return "Updated price for product id : " + productId;
    }

    @Override
    public String deleteProductById(Integer productId) throws ProductException {
        Product foundProduct = productDAO.getProductById(productId);
        if (foundProduct == null) {
            throw new ProductException("Product not found for id : " + productId);
        } else {
            productDAO.deleteProductById(foundProduct);
        }
        return "Product deleted successfully..! Product : " + foundProduct.getProductName();
    }
}
