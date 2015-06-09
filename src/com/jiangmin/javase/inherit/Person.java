package com.jiangmin.javase.inherit;

public class Person {
	private String name;
	private int age;
	private String gender;
	private String identity;
	
	public Person(){
		
	}
	
	public Person(String name){
		this.name = name;
	}
	
	public Person(String name, int age, String gender, String identity){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.identity = identity;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}
}
