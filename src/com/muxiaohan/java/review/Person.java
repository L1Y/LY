package com.muxiaohan.java.review;

public class Person {
	private String name;
	private String sex;
	private int age;
	private String identifial;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getIdentifial() {
		return identifial;
	}
	public void setIdentifial(String identifial) {
		this.identifial = identifial;
	}
	
	public Person(String name,String sex){
		this.name = name;
		this.sex = sex;
	}
	public Person(){}
	
	public Person(String name,String sxe,int age,String identifial){
		this.name = name;
		this.identifial = identifial;
		this.age = age;
		this.sex = sex;
	}
	
	public String identifialtoString(String identifial){
		return identifial.toString();
	}
	public String identifialtoString(String identifial, int Sno) {
		// TODO Auto-generated method stub
		return null;
	}
}
