package com.hwua.service;

import java.util.List;

import com.hwua.pojo.ShopCart;

public interface ShopCartService {
	public List<ShopCart> queryAll1(String username);
	public boolean deleteone1(int id);
	public List<ShopCart> queryOne1(int id);

}
