package com.hwua.service;

import java.util.List;

import com.hwua.pojo.User;

public interface UserService {

	public boolean queryByNameAndPassword(String username, String password);
	public List<User> queryAll();
	public boolean insertOne(String username,String password);
}
