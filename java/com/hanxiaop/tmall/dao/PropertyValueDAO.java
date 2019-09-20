package com.hanxiaop.tmall.dao;
 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hanxiaop.tmall.pojo.Product;
import com.hanxiaop.tmall.pojo.Property;
import com.hanxiaop.tmall.pojo.PropertyValue;

public interface PropertyValueDAO extends JpaRepository<PropertyValue,Integer>{

	List<PropertyValue> findByProductOrderByIdDesc(Product product);
	PropertyValue getByPropertyAndProduct(Property property, Product product);

	
	
	
}
