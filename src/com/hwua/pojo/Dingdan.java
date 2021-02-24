package com.hwua.pojo;

public class Dingdan {
	private int d_id;
	private String d_name;
	private double d_price;
	private int d_inventory;
	private String d_fahuo;
	private int d_dizhiid;
	private String d_tupian;
	private String d_shuoming;
	private String d_username;
	
	
	public Dingdan(int d_id, String d_name, double d_price, int d_inventory, String d_fahuo, int d_dizhiid,
			String d_tupian, String d_shuoming, String d_username) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
		this.d_price = d_price;
		this.d_inventory = d_inventory;
		this.d_fahuo = d_fahuo;
		this.d_dizhiid = d_dizhiid;
		this.d_tupian = d_tupian;
		this.d_shuoming = d_shuoming;
		this.d_username = d_username;
	}
	public Dingdan() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dingdan [d_id=" + d_id + ", d_name=" + d_name + ", d_price=" + d_price + ", d_inventory=" + d_inventory
				+ ", d_fahuo=" + d_fahuo + ", d_dizhiid=" + d_dizhiid + ", d_tupian=" + d_tupian + ", d_shuoming="
				+ d_shuoming + ", d_username=" + d_username + "]";
	}
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public double getD_price() {
		return d_price;
	}
	public void setD_price(double d_price) {
		this.d_price = d_price;
	}
	public int getD_inventory() {
		return d_inventory;
	}
	public void setD_inventory(int d_inventory) {
		this.d_inventory = d_inventory;
	}
	public String getD_fahuo() {
		return d_fahuo;
	}
	public void setD_fahuo(String d_fahuo) {
		this.d_fahuo = d_fahuo;
	}
	public int getD_dizhiid() {
		return d_dizhiid;
	}
	public void setD_dizhiid(int d_dizhiid) {
		this.d_dizhiid = d_dizhiid;
	}
	public String getD_tupian() {
		return d_tupian;
	}
	public void setD_tupian(String d_tupian) {
		this.d_tupian = d_tupian;
	}
	public String getD_shuoming() {
		return d_shuoming;
	}
	public void setD_shuoming(String d_shuoming) {
		this.d_shuoming = d_shuoming;
	}
	public String getD_username() {
		return d_username;
	}
	public void setD_username(String d_username) {
		this.d_username = d_username;
	}
	
	
	
	
	
	

}
