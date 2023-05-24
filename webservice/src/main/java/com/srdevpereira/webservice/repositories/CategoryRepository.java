package com.srdevpereira.webservice.repositories;

import com.srdevpereira.webservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
