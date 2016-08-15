package com.atguigu.spring.helloworld;

import java.util.List;

public class User {

	private String userName;
	private List<Car> cars;
	
	private String wifeName;
	
	public String getWifeName() {
		return wifeName;
	}

	public void setWifeName(String wifeName) {
		System.out.println("设置wifeName属性。。。"+wifeName);
		this.wifeName = wifeName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("设置userName属性。。。"+userName);
		this.userName = userName;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	// 构造方法
	public User() {
		System.out.println("正在使用构造方法 Construtor...");
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", cars=" + cars + ", wifeName="+wifeName+"]";
	}
	// 初始化方法
	public void init(){
		System.out.println("init method...");
	}
	// 销毁方法
	public void destroy(){
		System.out.println("destroy method...");
	}

}
