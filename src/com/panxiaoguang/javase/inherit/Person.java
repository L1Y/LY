package com.panxiaoguang.javase.inherit;

public class Person {
	private String name;
	private String gender;
	private int age;
	private String idenidy;
	
	//修饰符+方法类型+方法名称{方法体}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	
	
	public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
	
	
	
	public int getAge(){
		return age;
	}
	public void setAge(){
		this.age=age;
	}
	
	
	
	public String getIdenidy(){
		return idenidy;
	}
	public void setIdenidy(){
		this.idenidy=idenidy;
	}
}
