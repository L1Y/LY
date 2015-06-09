package com.hufeng.person;

public class Person {
	private String name;
	private String gender;
	private int age;
	protected String idenify;
	
	public String  getName(){
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
	public int  getAge(){
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
	public Person(String name){
		this.name = name;
	}
	
	public Person(int age, String name, String idenify, String gender){
	    this(name);
		this.age = age;
		this.idenify = idenify;
		this.gender = gender;
	}
	
	

}
