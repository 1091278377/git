package com.hwua.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.hwua.pojo.User;
import com.hwua.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String login(HttpSession session,String username, String password) {
		boolean b = userService.queryByNameAndPassword(username, password);
		Map<String,Object> map = new HashMap<String, Object>();
		//int i = 1/0;
		if(b) {
			session.setAttribute("USER_SESSION", username+password);
			map.put("flag", true);
			System.out.println(JSON.toJSONString(map));
			return JSON.toJSONString(map);
			
		}else {
			//return "login";
			map.put("flag", false);
			return JSON.toJSONString(map);
		}
	}
	
	@RequestMapping(value = "/queryall.do",  method = RequestMethod.POST,produces = "application/json;charset=utf-8")
	public @ResponseBody String queryAll(){//@RequestBody(required = false) Map<String, Object> map) {
		//System.out.println("冷风机阿来得及"+map);
		List<User> list = userService.queryAll();
		System.out.println(JSON.toJSONString(list));
		return JSON.toJSONString(list);
		
	}
	
	@RequestMapping(value = "/zhuche.do", method = RequestMethod.POST)
	public @ResponseBody String zhuche(HttpSession session,String username, String password) {
		boolean b = userService.insertOne(username, password);
		Map<String,Object> map = new HashMap<String, Object>();
		//int i = 1/0;
		if(b) {
			/* session.setAttribute("USER_SESSION", username+password); */
			map.put("flag", true);
			System.out.println(JSON.toJSONString(map));
			return JSON.toJSONString(map);
		}else {
			//return "login";
			map.put("flag", false);
			return JSON.toJSONString(map);
		}
	}
	
	
}
