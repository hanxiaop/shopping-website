package com.hanxiaop.tmall.comparator;


import java.util.Comparator;

import com.hanxiaop.tmall.pojo.Product;

public class ProductReviewComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return p2.getReviewCount()-p1.getReviewCount();
	}

}
