package com.tka.model;

public class user {

	String name;
	int age;
	String address;
	String moNum;
	
	
	public user(String name, int age, String address, String moNum) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.moNum = moNum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getMoNum() {
		return moNum;
	}


	public void setMoNum(String moNum) {
		this.moNum = moNum;
	}


	@Override
	public String toString() {
		return "user [name=" + name + ", age=" + age + ", address=" + address + ", moNum=" + moNum + "]";
	}
	
	
	
	
}
