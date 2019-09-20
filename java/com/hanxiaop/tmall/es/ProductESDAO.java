package com.hanxiaop.tmall.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.hanxiaop.tmall.pojo.Product;

public interface ProductESDAO extends ElasticsearchRepository<Product,Integer>{

}
