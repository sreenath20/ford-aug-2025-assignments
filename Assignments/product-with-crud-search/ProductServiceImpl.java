package com.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductDAO productDAO ;

    @Autowired
    public ProductServiceImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public Product addNewProduct(Product newProduct) throws InvalidProductDataException {
        if(newProduct.getName()==null || newProduct.getName().isEmpty())
            throw new InvalidProductDataException("Product name should not be null or empty");

        if(newProduct.getPrice() <= 0)
            throw new InvalidProductDataException("Price should be greater than 0");

        if (newProduct.getStock() < 0)
            throw new InvalidProductDataException("Stock should not be less than 0");

        return productDAO.addNewProduct(newProduct);
    }

    @Override
    public Product getProductById(Integer id) {
        return productDAO.getProductById(id);
    }

    @Override
    public Collection<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }

    @Override
    public Product updateProduct(Integer id,Product updatedProduct) throws InvalidProductDataException {
        if(updatedProduct.getPrice() <= 0)
            throw new InvalidProductDataException("Price should be greater than 0");

        if (updatedProduct.getStock() < 0)
            throw new InvalidProductDataException("Stock should not be less than 0");

        return productDAO.updateProduct(id,updatedProduct);
    }

    @Override
    public Product updateStockById(Integer id, Integer stock) {

        if(stock <= 0)
            throw new InvalidProductDataException("Stock should not be less than 0");

        Product foundProduct = productDAO.getProductById(id);
        foundProduct.setStock(stock);

        return productDAO.updateProduct(foundProduct.getId(),foundProduct);
    }

    @Override
    public String deleteProductById(Integer id) {
        return productDAO.deleteProductById(id);
    }

    @Override
    public Product searchProductByName(String name) {
        Collection<Product> foundProducts = productDAO.getAllProducts();

        Optional<Product> productByName = foundProducts.stream()
                .filter(product -> product.getName().equalsIgnoreCase(name))
                .findFirst();

        if(productByName.isEmpty())
            throw new ProductNotFoundException("Product with name " + name + " not found");

        return productByName.get();
    }
}
