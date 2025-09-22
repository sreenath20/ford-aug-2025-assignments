package SpringBoot_ProductManagementAPI;

import com.example.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {



        @Autowired
        private ProductService productService;

        @PostMapping("/products")
        public Product addProduct(@RequestBody Product product) {
            return productService.addProduct(product);
        }

        @GetMapping("/products/{id}")
        public Product getProduct(@PathVariable Integer id) {
            return productService.getProductById(id);
        }

        @GetMapping("/products")
        public List<Product> getAllProducts() {
            return productService.getAllProducts();
        }

        @PutMapping("/products/{id}")
        public Product updateProduct(@PathVariable Integer id, @RequestBody Product product) {
            return productService.updatProduct(id, product);
        }

        @PatchMapping("/products/{id}/stock")
        public Product updateStock(@PathVariable Integer id, @RequestBody Integer stock) {
            return productService.updateStock(id, stock);
        }

        @DeleteMapping("/products/{id}")
        public void deleteProduct(@PathVariable Integer id) {
            productService.deleteProduct(id);
        }

        @GetMapping("/products/searchByName")
        public List<Product> searchProducts(@RequestParam String name) {
            return productService.searchProductByName(name);
        }
    }


