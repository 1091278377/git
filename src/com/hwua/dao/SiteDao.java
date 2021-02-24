package com.hwua.dao;

import java.util.List;

import com.hwua.pojo.Site;

public interface SiteDao {
    public List<Site> queryAll1();
    public void addOne1(Site site);
    public List<Site> queryOne1(int id);
    public void deleteOne1(int id);
}
