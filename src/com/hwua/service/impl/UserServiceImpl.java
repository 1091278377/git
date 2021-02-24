package com.hwua.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwua.dao.UserDao;
import com.hwua.pojo.User;
import com.hwua.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private  UserDao userDao;

	@Override
	public boolean queryByNameAndPassword(String username, String password) {
		int i = userDao.queryByNameAndPassword(username, password);
		// 用户登录的话，还可以添加 权限认证、是否登录过 业务逻辑
		return i > 0;
	}

	@Override
	public List<User> queryAll() {
		List<User> list = userDao.queryAll();
		// 是否全部输入我们数据的所有字段，有些字段是否需要再次编译
		return list;
	}

	@Override
	public boolean insertOne(String username, String password) {
		userDao.insertOne(username, password);
		return true ;
	}

}
