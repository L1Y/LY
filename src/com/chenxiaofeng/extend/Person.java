package com.chenxiaofeng.extend;

public class Person {
	protected String name;
	protected String gender;
	protected int age;
	protected String IDCardNo;
	
	public Person(){};
	
	public Person(String name, String gender, int age, String iDCardNo) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		IDCardNo = iDCardNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getIDCardNo() {
		return IDCardNo;
	}
	public void setIDCardNo(String iDCardNo) {
		IDCardNo = iDCardNo;
	}
}
