package com.hwua.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.hwua.pojo.Dingdan;
import com.hwua.pojo.Site;

import com.hwua.service.SiteService;

@Controller
public class SiteController {
	@Autowired
	public SiteService siteService;
	@RequestMapping(value = "/Site1.do",  method = RequestMethod.POST,produces = "application/json;charset=utf-8")
	public @ResponseBody String queryAll(){//@RequestBody(required = false) Map<String, Object> map) {
		//System.out.println(+map);
		List<Site> list = siteService.queryAll1();
		System.out.println(JSON.toJSONString(list));
		return JSON.toJSONString(list);
		
	}
	@RequestMapping(value = "/Site2.do",  method = RequestMethod.POST,produces = "application/json;charset=utf-8")
	public @ResponseBody String addOne1(HttpSession session,String name, String phone ,String dizhi){
		int id=0;
		Site site=new Site(id,name,dizhi,phone);
		boolean b = siteService.addOne1(site);
		System.out.println(JSON.toJSONString(b));
		return JSON.toJSONString(b);
		
	}
	@RequestMapping(value = "/Site3.do",  method = RequestMethod.POST,produces = "application/json;charset=utf-8")
	public @ResponseBody String addAll1(HttpSession session,double price1,int id1, String name1 ,int dizhiid1,String tupian2,int inventory1,String shuoming1,String username1){
		
		String fahuo="µÈ´ý·¢»õ";
		Dingdan dingdan=new Dingdan(id1,name1,price1, inventory1, fahuo,dizhiid1, tupian2, shuoming1,username1);
		boolean b = siteService.addAll1(dingdan);
		System.out.println(JSON.toJSONString(b));
		return JSON.toJSONString(b);
		
	}
	@RequestMapping(value = "/Site4.do",  method = RequestMethod.POST,produces = "application/json;charset=utf-8")
	public @ResponseBody String addOne1(HttpSession session,int id){
		List<Site> b = siteService.queryOne1(id);
		System.out.println(JSON.toJSONString(b));
		return JSON.toJSONString(b);
		
	}
	@RequestMapping(value = "/Site5.do",  method = RequestMethod.POST,produces = "application/json;charset=utf-8")
	public @ResponseBody String deleteOne1(HttpSession session,int id){
		boolean b = siteService.deleteOne1(id);
		System.out.println(JSON.toJSONString(b));
		return JSON.toJSONString(b);
		
	}
}
