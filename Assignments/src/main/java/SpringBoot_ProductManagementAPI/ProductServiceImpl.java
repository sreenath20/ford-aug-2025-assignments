package SpringBoot_ProductManagementAPI;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class ProductServiceImpl implements ProductService {

    private Map<Integer,Product> productRepo = new HashMap<Integer,Product>();


    @Override
    public Product addProduct(Product product) throws InvalidProductDataException {


        if(productRepo.containsKey(product.getId())){
            throw new InvalidProductDataException("Product with id " + product.getId() + " already exists");
        }
        if(product.getName()==null||product.getPrice()<0||product.getStock()<0) {

            throw new InvalidProductDataException("Product Data is not Valid");
        }
        productRepo.put(product.getId(),product);
        return product;

    }

    @Override
    public Product getProductById(Integer id) throws ProductNotFoundException {
        Product product = productRepo.get(id);
        if(product==null) {
            throw new ProductNotFoundException("Product with id "+id+" Not Found");
        }
        return product;
    }

    @Override
    public List<Product> getAllProducts() throws ProductNotFoundException {
        return new ArrayList<Product>(productRepo.values());
    }

    @Override
    public Product updatProduct(Integer id, Product updatedProduct) throws ProductNotFoundException, InvalidProductDataException {
        Product found = productRepo.get(id);
        if(found==null) {
            throw new ProductNotFoundException("Product with id "+id+" Not Found ");
        }
        found.setId(updatedProduct.getId());
        found.setPrice(updatedProduct.getPrice()+300.0);
        found.setName(updatedProduct.getName()+"updated");
        productRepo.put(found.getId(),found);
        return found;
    }

    @Override
    public Product updateStock(Integer id, Integer stock) throws ProductNotFoundException, InvalidProductDataException {

        if (id == null||stock<0) {
            throw new InvalidProductDataException("Product Data Invalid");
        }
        Product found = productRepo.get(id);
        if(found==null) {
            throw new ProductNotFoundException("Product with id "+id+" Not Found ");
        }
        found.setStock(stock+found.getStock());
        productRepo.put(found.getId(),found);
        return found;
    }

    @Override
    public void deleteProduct(Integer id) throws ProductNotFoundException {
        if (id == null) {
            throw new ProductNotFoundException("Product Data Invalid");
        }
        Product found = productRepo.get(id);
        if(found==null) {
            throw new ProductNotFoundException("Product with id "+id+" Not Found ");
        }
    }

    @Override
    public List<Product> searchProductByName(String keyword) throws ProductNotFoundException {
        return productRepo.values().stream()
                .filter(p -> p.getName().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }
}
