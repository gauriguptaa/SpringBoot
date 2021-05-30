package com.develop.smoothieOrders.Controller;

import com.develop.smoothieOrders.Models.Menu;
import com.develop.smoothieOrders.Models.Orders;
import com.develop.smoothieOrders.Repository.OrdersRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @Autowired
    OrdersRepository ordersRepository;
    @GetMapping
    public List<Orders> getOrders() {
        return ordersRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Orders getOrderById(@PathVariable Long id){
        return ordersRepository.getById(id);
    }

    @PostMapping
    public Orders addOrder(@RequestBody final Orders orders){
        return ordersRepository.saveAndFlush(orders);
    }

    @RequestMapping(value = "{orderId}",method = RequestMethod.PUT)
    public Orders updateOrder(@PathVariable Long orderId,@RequestBody Orders orders){
        Orders existingOrders = ordersRepository.getById(orderId);
        BeanUtils.copyProperties(orders,existingOrders,"orderId");
        return ordersRepository.saveAndFlush(existingOrders);
    }

    @RequestMapping(value = "{orderId}",method = RequestMethod.DELETE)
    public void deleteOrder(@PathVariable Long orderId){
        ordersRepository.deleteById(orderId);

    }

}
