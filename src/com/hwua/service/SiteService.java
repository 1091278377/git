package com.hwua.service;

import java.util.List;

import com.hwua.pojo.Dingdan;
import com.hwua.pojo.Site;

public interface SiteService {
	public List<Site> queryAll1();
	public boolean addOne1(Site site);
	public boolean addAll1(Dingdan dingdan);
	public List<Site> queryOne1(int id);
	public boolean deleteOne1(int id);
}
