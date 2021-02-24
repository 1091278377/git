package com.hwua.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwua.dao.ShopCartDao;
import com.hwua.pojo.ShopCart;
import com.hwua.service.ShopCartService;

@Service

public class ShopCatServiceImp implements ShopCartService {
	@Autowired
	private ShopCartDao shopcartdao;

	@Override
	public List<ShopCart> queryAll1(String username) {
		List<ShopCart> shopcart=shopcartdao.queryAll1(username);
		return shopcart;
	}

	@Override
	public boolean deleteone1(int id) {
		shopcartdao.deleteone1(id);
		boolean b= true;
		return b;
		
		
	}

	@Override
	public List<ShopCart> queryOne1(int id) {
		List<ShopCart> shopcart1=shopcartdao.queryOne1(id);
		return shopcart1;
	}

}
