package com.hwua.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwua.dao.DingdanDao;

import com.hwua.pojo.Dingdan;
import com.hwua.service.DingdanService;
@Service

public class DingdanServiceImp implements DingdanService {
	@Autowired
	private DingdanDao dingdan;
	@Override
	public List<Dingdan> queryAll1(String username) {
		List<Dingdan> b=dingdan.queryAll1(username);
		return b;
	}

}
