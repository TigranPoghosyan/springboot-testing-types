package com.example.springboottestingtypes.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("select p from Product p where p.disabled=false ")
    List<Product> findAllActiveProducts();
}
