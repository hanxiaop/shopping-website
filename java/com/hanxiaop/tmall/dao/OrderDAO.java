package com.hanxiaop.tmall.dao;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hanxiaop.tmall.pojo.Order;
import com.hanxiaop.tmall.pojo.User;

public interface OrderDAO extends JpaRepository<Order,Integer>{
    public List<Order> findByUserAndStatusNotOrderByIdDesc(User user, String status);
}
