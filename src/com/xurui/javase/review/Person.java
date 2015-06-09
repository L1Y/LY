package com.xurui.javase.review;

public class Person {
	private String name;
	private String gender;
	private int age;
	private String indentifg;
	
	public Person(){
		
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
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setIndentifg(String indentifg){
		this.indentifg = indentifg;
	}
	
	public String getIndentifg(){
		return indentifg;
	}
	
	
	public Person(String name){
		this.name = name;
	}
	
	public Person(String name,String gender,int age,String indentifg){
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.indentifg = indentifg;
	}
	

}
