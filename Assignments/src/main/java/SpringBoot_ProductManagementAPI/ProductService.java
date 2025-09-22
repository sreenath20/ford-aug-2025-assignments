package SpringBoot_ProductManagementAPI;
import java.util.List;
public interface ProductService {

    public Product addProduct(Product product) throws InvalidProductDataException;
    public Product getProductById(Integer id) throws ProductNotFoundException;
    public List<Product> getAllProducts()throws ProductNotFoundException;
    public Product updatProduct(Integer id, Product updatedProduct) throws ProductNotFoundException,InvalidProductDataException ;
    public Product updateStock(Integer id,Integer stock)throws ProductNotFoundException,InvalidProductDataException;
    public void deleteProduct(Integer id)throws ProductNotFoundException;
    public List<Product> searchProductByName (String keyword) throws ProductNotFoundException;

}
