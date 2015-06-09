package com.lzm.javase.person;

public class Person {
	
	private String name;
	private String gender;
	private int age;
	private String identify;
	
	public Person() {
	}
	public Person(String name) {
		setName(name);
	}
	public Person(String name, String gender, int age, String identify) {
		this(name);
		setGender(gender);
		setAge(age);
		setIdentify(identify);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setIdentify(String identify) {
		this.identify = identify;
	}
	public String getIdentify() {
		return identify;
	}

}
