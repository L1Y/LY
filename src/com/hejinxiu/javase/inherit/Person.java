package com.hejinxiu.javase.inherit;

public class Person {
	private String name;
	private String gender;
	private int age;
	private String idenify;
	
	public void setName(String name){
		this.name = name;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setIdenify(String idenify){
		this.idenify = idenify;
	}
	public String getName(){
		return name;
	}
	public String getGender(){
		return gender;
	}
	public int getAge(){
		return age;
	}
	public String getIdenify(){
		return idenify;
	}
	
	public Person(){
		
	}
	/**
	 * 重载构造函数
	 * @param name
	 * @param gender
	 * @param age
	 * @param idenify
	 */
	public Person(String name, String gender, int age, String idenify){
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.idenify = idenify;
	}
	

}
