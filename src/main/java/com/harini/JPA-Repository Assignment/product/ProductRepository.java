package com.abc.app.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface ProductRepository extends JpaRepository<ElectronicsProduct,Integer> {

    public Collection<ElectronicsProduct> findByName(String name);

    public Collection<ElectronicsProduct> findByPriceBetween(Double minPrice,Double maxPrice);

    public Collection<ElectronicsProduct> findByStockLessThanEqual(Integer stock);

    @Query("SELECT product FROM ElectronicsProduct product WHERE product.price BETWEEN ?1 AND ?2")
    public Collection<ElectronicsProduct> getAllByPriceBetween(Double minPrice,Double maxPrice);

    //NativeQuery allows you to write sql query
    @NativeQuery("SELECT * FROM Electronics_Product WHERE stock<=:quantity")
    public Collection<ElectronicsProduct> getAllStockLessThanEqual(@Param("quantity") Integer stock);

    @Modifying
    @Query("DELETE FROM ElectronicsProduct ep WHERE ep.id = :id")
    public void deleteById(@Param("id") Integer id);



}
