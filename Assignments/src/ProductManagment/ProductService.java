package ProductManagment;


import java.util.List;

public interface ProductService {
    Product addProduct(Product product);
    Product getProductById(Integer id);
    List<Product> getAllProducts();
    Product updateProduct(Integer id, Product updatedProduct);
    Product updateStock(Integer id, Integer stock);
    void deleteProduct(Integer id);
    List<Product> searchProductsByName(String keyword);
}