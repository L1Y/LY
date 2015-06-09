package com.chuan.javase.person;

public class Person {
	protected String name;
	protected String gender;
	protected String age;
	protected String idenify;
	
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
	
	public void setIdenify(String idenify){
		this.idenify = idenify;
	}
	
	public String getIdenify(){
		return idenify;
	}
	
	public Person(){
		
	}
	
	public Person(String name,String gender,String age,String idenify){
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.idenify = idenify;
	}
	
}
