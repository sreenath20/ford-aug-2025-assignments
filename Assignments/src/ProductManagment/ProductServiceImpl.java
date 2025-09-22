package ProductManagment;

import org.springframework.stereotype.Service;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    private final Map<Integer, Product> productRepo;
    private int nextId = 1;

    public ProductServiceImpl() {
        productRepo = new HashMap<>();
    }

    private void validateProduct(Product product) {
        if (product.getName() == null || product.getName().trim().isEmpty()) {
            throw new InvalidProductDataException("Product name cannot be blank");
        }
        if (product.getPrice() == null || product.getPrice() <= 0) {
            throw new InvalidProductDataException("Product price must be greater than 0");
        }
        if (product.getStock() == null || product.getStock() < 0) {
            throw new InvalidProductDataException("Product stock cannot be negative");
        }
    }
    @Override
    public Product addProduct(Product product) {
        validateProduct(product);
        product.setId(nextId++);
        productRepo.put(product.getId(), product);
        return product;
    }
    @Override
    public Product getProductById(Integer id) {
        Product product = productRepo.get(id);
        if (product == null) {
            throw new ProductNotFoundException("Product with id " + id + " not found");
        }
        return product;
    }
    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(productRepo.values());
    }
    @Override
    public Product updateProduct(Integer id, Product updatedProduct) {
        if (!productRepo.containsKey(id)) {
            throw new ProductNotFoundException("Product with id " + id + " not found");
        }
        validateProduct(updatedProduct);
        updatedProduct.setId(id);
        productRepo.put(id, updatedProduct);
        return updatedProduct;
    }
    @Override
    public Product updateStock(Integer id, Integer stock) {
        Product product = getProductById(id);
        if (stock < 0) {
            throw new InvalidProductDataException("Stock cannot be negative");
        }
        product.setStock(stock);
        return product;
    }
    @Override
    public void deleteProduct(Integer id) {
        if (!productRepo.containsKey(id)) {
            throw new ProductNotFoundException("Product with id " + id + " not found");
        }
        productRepo.remove(id);
    }
    @Override
    public List<Product> searchProductsByName(String keyword) {
        return productRepo.values().stream()
                .filter(p -> p.getName().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }
}
