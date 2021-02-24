package com.hwua.dao;

import java.util.List;

import com.hwua.pojo.Shop;



public interface ShopDao {
	
		public List<Shop> queryAll1();
		public List<Shop> queryAll2(double price);
		public List<Shop> queryOne1(int id);
		

	
}
