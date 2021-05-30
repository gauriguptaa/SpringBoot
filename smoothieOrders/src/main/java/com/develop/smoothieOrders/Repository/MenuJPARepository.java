package com.develop.smoothieOrders.Repository;

import com.develop.smoothieOrders.Models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuJPARepository extends JpaRepository<Menu,Long> {
}
