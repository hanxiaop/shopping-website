package com.hanxiaop.tmall.dao;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.hanxiaop.tmall.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category,Integer>{

}
