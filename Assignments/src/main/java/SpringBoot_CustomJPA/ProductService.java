package SpringBoot_CustomJPA;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ProductService {

    Product addNewProduct(Product product) throws ProductException;

    List<Product> findByPriceBetween(Double min, Double max);

    List<Product> findByNameContainingIgnoreCase(String keyword);

    List<Product> findByCategoryIn(List<String> categories);

    List<Product> findTop3ByCategoryOrderByPriceAsc(String category);

    List<Product> findByCreatedDateAfter(LocalDate date);

    List<Object[]> findAveragePriceByCategory();

    List<Object[]> findMostPopularCategory();

    List<Object[]> calculateStockValueByCategory();

    List<Product> findByStockEquals(Integer stock);

    List<Product> findByStockLessThan(Integer stock);

    List<Product> findByExpiryDateBefore(LocalDate date);

    int increasePriceByCategory(String category);

    int deleteOutOfStockProducts();

    List<Product> findMostExpensiveProductInEachCategory();

}
