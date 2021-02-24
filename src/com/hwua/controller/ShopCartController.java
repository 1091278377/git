package com.hwua.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.hwua.pojo.ShopCart;
import com.hwua.service.ShopCartService;

@Controller


public class ShopCartController {
	@Autowired
	public ShopCartService shopCartService;
	
	
	@RequestMapping(value = "/shop.do", method = RequestMethod.POST,produces = "application/json;charset=utf-8")
	public @ResponseBody String queryAll(String username){
     List<ShopCart> shop=shopCartService.queryAll1(username);
     System.out.println(JSON.toJSONString(shop));
     return JSON.toJSONString(shop) ;
}

	@RequestMapping(value = "/deleshopcart.do", method = RequestMethod.POST,produces = "application/json;charset=utf-8")
	public @ResponseBody String deleteone1(int id){
     boolean b=shopCartService.deleteone1(id);
     return JSON.toJSONString(b);
}
	@RequestMapping(value = "/CarqueryOne1.do", method = RequestMethod.POST,produces = "application/json;charset=utf-8")
	public @ResponseBody String queryOne1(int id){
     List<ShopCart> b=shopCartService.queryOne1(id);
     return JSON.toJSONString(b);
}
	
}
