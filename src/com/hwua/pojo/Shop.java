package com.hwua.pojo;

public class Shop {
	private int s_id;
	private String s_tupian;
	private String s_name;
	private String s_shuoming;
	private double s_price;
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shop(int s_id, String s_tupian, String s_name, String s_shuoming, double s_price) {
		super();
		this.s_id = s_id;
		this.s_tupian = s_tupian;
		this.s_name = s_name;
		this.s_shuoming = s_shuoming;
		this.s_price = s_price;
	}
	@Override
	public String toString() {
		return "Shop [s_id=" + s_id + ", s_tupian=" + s_tupian + ", s_name=" + s_name + ", s_shuoming=" + s_shuoming
				+ ", s_price=" + s_price + "]";
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_tupian() {
		return s_tupian;
	}
	public void setS_tupian(String s_tupian) {
		this.s_tupian = s_tupian;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_shuoming() {
		return s_shuoming;
	}
	public void setS_shuoming(String s_shuoming) {
		this.s_shuoming = s_shuoming;
	}
	public double getS_price() {
		return s_price;
	}
	public void setS_price(double s_price) {
		this.s_price = s_price;
	}
	

}
