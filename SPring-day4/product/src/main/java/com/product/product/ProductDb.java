package com.product.product;

import java.time.Year;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDb extends JpaRepository<Product, Integer> {

    Product findByNameIgnoreCase(String productname);

    List<Product> findByPlaceIgnoreCase(String place);

    // List<Product> findByWrantyYearLessThan(Year current_year);

    // List<Product> findAllBysubString(String sub_String);
    // List<Product> findByWarantyIsGreaterThanCurrentYear();
}
