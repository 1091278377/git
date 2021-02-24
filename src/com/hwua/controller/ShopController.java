package com.hwua.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.hwua.pojo.Shop;
import com.hwua.pojo.ShopCart;
import com.hwua.service.ShopCartService;
import com.hwua.service.ShopService;

@Controller

public class ShopController {
	@Autowired
	public ShopService shopService;
	
	@RequestMapping(value = "/shop1.do", method = RequestMethod.POST,produces = "application/json;charset=utf-8")
	public @ResponseBody String queryAll(){
     List<Shop> shop=shopService.queryAll1();
     
     return JSON.toJSONString(shop) ;

}
	@RequestMapping(value = "/shop3.do", method = RequestMethod.POST,produces = "application/json;charset=utf-8")
	public @ResponseBody String queryAll2(){
     List<Shop> shop=shopService.queryAll2();
     
     return JSON.toJSONString(shop) ;

}
	
	@RequestMapping(value = "/shop2.do", method = RequestMethod.POST)
	public @ResponseBody String shop2(HttpSession session,String name, String tupian ,String shuoming,String price,String inventory,String username) {
	    int id= 1;
	    
		double price1=Double.parseDouble(price);
		int inventory1=Integer.parseInt(inventory);
	    ShopCart aaa= new ShopCart(id,tupian,name,price1,inventory1,shuoming,username);
		System.out.println(aaa);
		boolean b = shopService.addAll1(aaa);
		Map<String,Object> map = new HashMap<String, Object>();
		if(b) {
         	map.put("flag", true);
			System.out.println(JSON.toJSONString(map));
			return JSON.toJSONString(map);
		}else {
			//return "login";
			map.put("flag", false);
			return JSON.toJSONString(map);
		}
	}
	@RequestMapping(value = "/queryOne1.do", method = RequestMethod.POST,produces = "application/json;charset=utf-8")
	public @ResponseBody String shop2(HttpSession session,String id) {    
		int id1 = Integer.parseInt(id);
		List <Shop> b = shopService.queryOne1(id1);
		Map<String,Object> map = new HashMap<String, Object>();
		if(b!=null) {
         	map.put("flag", true);
         	map.put("data", b);
			System.out.println(JSON.toJSONString(map));
			return JSON.toJSONString(map);
		}else {
			//return "login";
			map.put("flag", false);
			return JSON.toJSONString(map);
		}
	}
	
}
