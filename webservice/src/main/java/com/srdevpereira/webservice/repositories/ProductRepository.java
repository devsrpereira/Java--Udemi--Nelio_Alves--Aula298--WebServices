package com.srdevpereira.webservice.repositories;

import com.srdevpereira.webservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
