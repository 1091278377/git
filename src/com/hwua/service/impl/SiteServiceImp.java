package com.hwua.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwua.dao.DingdanDao;
import com.hwua.dao.ShopCartDao;
import com.hwua.dao.SiteDao;
import com.hwua.pojo.Dingdan;
import com.hwua.pojo.Site;
import com.hwua.service.SiteService;


@Service
public class SiteServiceImp implements SiteService {
	@Autowired
	private SiteDao sitedao;
	@Autowired
	private DingdanDao dingdandao;
	@Autowired
	private ShopCartDao shopcartdao;
	
	@Override
	public List<Site> queryAll1() {
		List<Site> b=sitedao.queryAll1();
		return b;
	}
	@Override
	public boolean addOne1(Site site) {
		sitedao.addOne1(site);
		boolean b=true;
		return b;
	}
	@Override
	public boolean addAll1(Dingdan dingdan) {
		dingdandao.addAll1(dingdan);
		int id=dingdan.getD_id();
		shopcartdao.deleteone1(id);
		boolean b=true;
		return b;
	}
	@Override
	public List<Site> queryOne1(int id) {
		List<Site>b=sitedao.queryOne1(id);
		return b;
	}
	@Override
	public boolean deleteOne1(int id) {
		sitedao.deleteOne1(id);
		boolean b=true;
		return b;
	}


}
