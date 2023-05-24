package com.srdevpereira.webservice.repositories;

import com.srdevpereira.webservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
