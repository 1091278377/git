package com.hwua.pojo;

public class ShopCart {
	private int id;
	private String tupian;
	private String name;
	private double price;
	private int inventory;
	private String shuoming;
	private String username;
	
	public ShopCart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShopCart(int id, String tupian, String name, double price, int inventory, String shuoming, String username) {
		super();
		this.id = id;
		this.tupian = tupian;
		this.name = name;
		this.price = price;
		this.inventory = inventory;
		this.shuoming = shuoming;
		this.username = username;
	}
	@Override
	public String toString() {
		return "ShopCart [id=" + id + ", tupian=" + tupian + ", name=" + name + ", price=" + price + ", inventory="
				+ inventory + ", shuoming=" + shuoming + ", username=" + username + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTupian() {
		return tupian;
	}
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	public String getShuoming() {
		return shuoming;
	}
	public void setShuoming(String shuoming) {
		this.shuoming = shuoming;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
