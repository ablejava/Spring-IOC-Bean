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
		System.out.println("����wifeName���ԡ�����"+wifeName);
		this.wifeName = wifeName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("����userName���ԡ�����"+userName);
		this.userName = userName;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	// ���췽��
	public User() {
		System.out.println("����ʹ�ù��췽�� Construtor...");
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", cars=" + cars + ", wifeName="+wifeName+"]";
	}
	// ��ʼ������
	public void init(){
		System.out.println("init method...");
	}
	// ���ٷ���
	public void destroy(){
		System.out.println("destroy method...");
	}

}
