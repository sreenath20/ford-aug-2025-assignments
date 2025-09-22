package com.demo.product_rest_api;

import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO {

    private Connection connection;

    ProductDAOImpl() {
        try {
            connection = DriverManager.getConnection("jdbc:h2:file:./data/product_api", "sa", "password");

            String createTableSQL = "CREATE TABLE IF NOT EXISTS product (productId INT PRIMARY KEY, productName VARCHAR(50), productPrice DOUBLE, quantity INT)";
            PreparedStatement preparedStatement = connection.prepareStatement(createTableSQL);
            preparedStatement.execute();

            System.out.println("Database and table initialized successfully!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Product saveProduct(Product newProduct) throws ProductException {
        String insertQuery = "INSERT INTO product VALUES (?,?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setInt(1, newProduct.getProductId());
            preparedStatement.setString(2, newProduct.getProductName());
            preparedStatement.setDouble(3, newProduct.getProductPrice());
            preparedStatement.setInt(4, newProduct.getQuantity());

            int recordCount = preparedStatement.executeUpdate();
            if (recordCount > 0) {
                return newProduct;
            } else {
                throw new ProductException("Product could not be saved in the Database.");
            }
        } catch (SQLException e) {
            throw new ProductException(e.getMessage());
        }
    }

    @Override
    public Collection<Product> getAllProducts() throws ProductException {
        List<Product> products = new ArrayList<>();
        String selectQuery = "SELECT * FROM product";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Product product = new Product();
                product.setProductId(resultSet.getInt("productId"));
                product.setProductName(resultSet.getString("productName"));
                product.setProductPrice(resultSet.getDouble("productPrice"));
                product.setQuantity(resultSet.getInt("quantity"));
                products.add(product);
            }
            return products;
        } catch (SQLException e) {
            throw new ProductException(e.getMessage());
        }
    }

    @Override
    public Product getProductById(Integer productId) throws ProductException {
        String selectQuery = "SELECT * FROM product WHERE productId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setInt(1, productId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                Product foundProduct = new Product();
                foundProduct.setProductId(resultSet.getInt("productId"));
                foundProduct.setProductName(resultSet.getString("productName"));
                foundProduct.setProductPrice(resultSet.getDouble("productPrice"));
                foundProduct.setQuantity(resultSet.getInt("quantity"));

                return foundProduct;
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Product updateProduct(Product product) throws ProductException {
        String updateQuery = "UPDATE product SET productName = ?, productPrice = ?, quantity = ? WHERE productId = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, product.getProductName());
            preparedStatement.setDouble(2, product.getProductPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setInt(4, product.getProductId());
            int recordCount = preparedStatement.executeUpdate();
            if (recordCount > 0) {
                return product;
            } else {
                throw new ProductException("Product could not be updated in the Database.");
            }

        } catch (SQLException e) {
            throw new ProductException(e.getMessage());
        }
    }

    @Override
    public Product updatePrice(Product product, Double updatedPrice) throws ProductException {
        String updateQuery = "UPDATE product SET productPrice = ? WHERE productId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setDouble(1, product.getProductPrice());
            preparedStatement.setInt(2, product.getProductId());
            int recordCount = preparedStatement.executeUpdate();
            if (recordCount > 0) {
                return product;
            } else {
                throw new ProductException("Product price could not be updated in the Database.");
            }
        } catch (SQLException e) {
            throw new ProductException(e.getMessage());
        }
    }

    @Override
    public Boolean deleteProductById(Product product) throws ProductException {
        String deleteQuery = "DELETE FROM product WHERE productId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setInt(1, product.getProductId());
            int recordCount = preparedStatement.executeUpdate();
            if (recordCount > 0) {
                return true;
            } else {
                throw new ProductException("Product could not be deleted in the Database.");
            }
        } catch (SQLException e) {
            throw new ProductException(e.getMessage());
        }
    }
}
