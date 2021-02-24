package com.hwua.service;

import java.util.List;

import com.hwua.pojo.Shop;
import com.hwua.pojo.ShopCart;

public interface ShopService {
	public List<Shop> queryAll1();
	public List<Shop> queryAll2();
	public boolean addAll1(ShopCart aaa);
	public List<Shop> queryOne1(int id);
}
