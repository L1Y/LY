package com.zzc.javase.inherit;

public class Person {
	private String name;
	private String gender;
	private int age;
	private String identify;
	
	
	public Person() {
		
	}
	
	public Person(String name) {
		
		this.name = name;
	}
	public Person(String name, String gender, int age, String identify) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.identify = identify;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getIdentify() {
		return identify;
	}
	
	public void setIndentify(String indentify) {
		this.identify = indentify;
	}
	
	@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		return super.toString();
	}
}
