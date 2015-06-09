package com.yangxm.javase.oop1;

public class Person {
	private String name;
	private String gender;//性别
	private int age;
	private String idenify;//身份证号码
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	public String getIdenify(){
		return idenify;
	}
	public void setIdenify(String idenify){
		this.idenify = idenify;
	}
	
	public Person(){
		
	}
	
	public Person(String name,String gender){
		this.name = name;
		this.gender = gender;
	}
	
	public Person(String name,String gender,int age,String idenify){
		this(name,gender);
		this.age = age;
		this.idenify = idenify;
	}
}
