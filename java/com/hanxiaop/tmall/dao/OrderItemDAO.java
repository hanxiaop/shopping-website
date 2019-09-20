package com.hanxiaop.tmall.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hanxiaop.tmall.pojo.Order;
import com.hanxiaop.tmall.pojo.OrderItem;
import com.hanxiaop.tmall.pojo.Product;
import com.hanxiaop.tmall.pojo.User;

public interface OrderItemDAO extends JpaRepository<OrderItem,Integer>{
	List<OrderItem> findByOrderOrderByIdDesc(Order order);
	List<OrderItem> findByProduct(Product product);
	List<OrderItem> findByUserAndOrderIsNull(User user);
}
