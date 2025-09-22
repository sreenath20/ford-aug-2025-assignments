package com.demo.product_rest_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductDAO productDAO;

    @Autowired
    public ProductServiceImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public Product addNewProduct(Product newProduct) {
        if (newProduct.getProductName() == null || newProduct.getProductName().isEmpty())
            throw new InvalidProductDataException("Product name should not be null or empty");

        if (newProduct.getProductPrice() <= 0)
            throw new InvalidProductDataException("Price should be greater than 0");

        if (newProduct.getQuantity() < 0)
            throw new InvalidProductDataException("Quantity should not be less than 0");

        Product foundProduct = productDAO.getProductById(newProduct.getProductId());
        if (foundProduct != null) {
            throw new InvalidProductDataException("Product already exists with id: " + newProduct.getProductId());
        }

        return productDAO.saveProduct(newProduct);
    }

    @Override
    public Product getProductById(Integer productId) {
        Product foundProduct = productDAO.getProductById(productId);
        if (foundProduct == null) {
            throw new ProductNotFoundException("Product not found for id: " + productId);
        }
        return foundProduct;
    }

    @Override
    public Collection<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }

    @Override
    public Product updateProduct(Integer productId, Product product) {
        if (product.getProductPrice() <= 0)
            throw new InvalidProductDataException("Price should be greater than 0");

        if (product.getQuantity() < 0)
            throw new InvalidProductDataException("Quantity should not be less than 0");

        Product foundProduct = productDAO.getProductById(productId);
        if (foundProduct == null) {
            throw new ProductNotFoundException("Product not found for id: " + productId);
        }

        product.setProductId(productId);
        return productDAO.updateProduct(product);
    }

    @Override
    public Product updateProductName(Integer productId, String newName) {
        Product foundProduct = productDAO.getProductById(productId);
        if (foundProduct == null) {
            throw new ProductNotFoundException("Product not found for id: " + productId);
        }
        foundProduct.setProductName(newName);
        return productDAO.updateProduct(foundProduct);
    }

    @Override
    public Product searchProductByName(String productName) {
        Collection<Product> foundProducts = productDAO.getAllProducts();

        Optional<Product> productByName = foundProducts.stream()
                .filter(product -> product.getProductName().equalsIgnoreCase(productName))
                .findFirst();

        if (productByName.isEmpty())
            throw new ProductNotFoundException("Product with name " + productName + " not found");

        return productByName.get();
    }

    @Override
    public String updateProductPrice(Integer productId, Double updatedPrice) {
        if (updatedPrice <= 0)
            throw new InvalidProductDataException("Price should be greater than 0");

        Product foundProduct = productDAO.getProductById(productId);
        if (foundProduct == null) {
            throw new ProductNotFoundException("Product not found for id: " + productId);
        }

        foundProduct.setProductPrice(updatedPrice);
        productDAO.updatePrice(foundProduct, updatedPrice);
        return "Updated price for product id: " + productId;
    }

    @Override
    public String deleteProductById(Integer productId) {
        Product foundProduct = productDAO.getProductById(productId);
        if (foundProduct == null) {
            throw new ProductNotFoundException("Product not found for id: " + productId);
        }
        productDAO.deleteProductById(foundProduct);
        return "Product deleted successfully! Product: " + foundProduct.getProductName();
    }
}
