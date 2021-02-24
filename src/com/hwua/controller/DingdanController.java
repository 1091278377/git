package com.hwua.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.hwua.pojo.Dingdan;

import com.hwua.service.DingdanService;

@Controller

public class DingdanController {
	@Autowired
	private DingdanService dingdanService; 
	@RequestMapping(value = "/dingdan1.do", method = RequestMethod.POST,produces = "application/json;charset=utf-8")
	public @ResponseBody String queryAll1(String username){
     List<Dingdan> b=dingdanService.queryAll1(username);
//     System.out.println(JSON.toJSONString(b));
//     return JSON.toJSONString(b) ;
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
