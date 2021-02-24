package com.hwua.dao;

import java.util.List;

import com.hwua.pojo.Shop;
import com.hwua.pojo.ShopCart;

public interface ShopCartDao {
	public List<ShopCart> queryAll1(String username);
	public void deleteone1(int id);
	public void addAll1(ShopCart aaa);
	public List<ShopCart> queryOne1(int id);
}
