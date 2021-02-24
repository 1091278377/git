package com.hwua.dao;

import java.util.List;

import com.hwua.pojo.Dingdan;


public interface DingdanDao {
	public List<Dingdan> queryAll1(String username);
	public void addAll1(Dingdan dingdan);
}
