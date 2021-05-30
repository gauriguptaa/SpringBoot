package com.develop.smoothieOrders.Repository;

import com.develop.smoothieOrders.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJPARepository extends JpaRepository<User,Long> {
}
