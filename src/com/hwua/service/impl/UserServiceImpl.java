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
		// �û���¼�Ļ������������ Ȩ����֤���Ƿ��¼�� ҵ���߼�
		return i > 0;
	}

	@Override
	public List<User> queryAll() {
		List<User> list = userDao.queryAll();
		// �Ƿ�ȫ�������������ݵ������ֶΣ���Щ�ֶ��Ƿ���Ҫ�ٴα���
		return list;
	}

	@Override
	public boolean insertOne(String username, String password) {
		userDao.insertOne(username, password);
		return true ;
	}

}
