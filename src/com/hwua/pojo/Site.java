package com.hwua.pojo;

public class Site {
	private int  t_id;
	private String t_name;
	private String t_dizhi;
	private String t_phone;
	
	public Site() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Site(int t_id, String t_name, String t_dizhi, String t_phone) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.t_dizhi = t_dizhi;
		this.t_phone = t_phone;
	}
	@Override
	public String toString() {
		return "Site [t_id=" + t_id + ", t_name=" + t_name + ", t_dizhi=" + t_dizhi + ", t_phone=" + t_phone + "]";
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getT_dizhi() {
		return t_dizhi;
	}
	public void setT_dizhi(String t_dizhi) {
		this.t_dizhi = t_dizhi;
	}
	public String getT_phone() {
		return t_phone;
	}
	public void setT_phone(String t_phone) {
		this.t_phone = t_phone;
	}

}
