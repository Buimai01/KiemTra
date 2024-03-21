package org.example.ktra2.repository;

import org.example.ktra2.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findByPriceBetween(double minPrice, double maxPrice);
    List<Product> findAllByOrderByAmountDesc();
    List<Product> findTop3ByOrderByPriceDesc();
    List<Product> findByCategoryName(String categoryName);
}
