package com.zhongguohua.javase.person;

public class Person {
	private String name;
	private String gender;
	private String age;
	private String identify; 
	
	public Person(String name){
		this.name = name;
	}
	
	public Person(String name,String gender){
		this(name);
		this.gender = gender;
	}
	
	public Person(String name,String gender,String age){
		this(name,gender);
		this.age = age;
	}
	
	public Person(String name,String gender,String age,String identify){
		this(name,gender,age);
		this.identify = identify;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
	
	public String getGender(){
		return gender;
	}
	
	public void setAge(String age){
		this.age = age;
	}
	
	public String getAge(){
		return age;
	}
	
	public void setIdentify(String identify){
		this.identify = identify;
	}
	
	public String getIdentify(){
		return identify;
	}

}
