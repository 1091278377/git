package com.hwua.dao;

import java.util.List;

import com.hwua.pojo.User;

public interface UserDao {

	public int queryByNameAndPassword(String username, String password);
	public List<User> queryAll();
	public void insertOne(String username,String password);
}
