package com.develop.smoothieOrders.Repository;

import com.develop.smoothieOrders.Models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders,Long> {
}
