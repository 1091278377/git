package com.hwua.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwua.dao.ShopCartDao;
import com.hwua.dao.ShopDao;
import com.hwua.pojo.Shop;
import com.hwua.pojo.ShopCart;
import com.hwua.service.ShopService;
@Service
public class ShopServiceImp implements ShopService {
	@Autowired
	private ShopDao shopdao;
	@Autowired
	private ShopCartDao shopcartdao;
	@Override
	public List<Shop> queryAll1() {
		List<Shop>aaa=shopdao.queryAll1();
		return aaa;
	}
	@Override
	public boolean addAll1(ShopCart aaa) {
		shopcartdao.addAll1(aaa);
		boolean b=true;
		return b;
	}
	@Override
	public List<Shop> queryOne1(int id) {
		List<Shop> b=shopdao.queryOne1(id);
		return b;
	}
	@Override
	public List<Shop> queryAll2() {
		double price=10.0;
		List<Shop> b2=shopdao.queryAll2(price);
		return b2;
	}

}
