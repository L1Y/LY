package com.aisiwei.javase.person;

public class Person 
{
	private String name;
	private String gender;
	private int age;
	private int identify;
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
	public int getIdentify() {
		return identify;
	}
	public void setIdentify(int identify) {
		this.identify = identify;
	}
	
	
	public Person()
	{
		
	}
	
	public Person(String name)
	{
		this.name = name;
	}
	
	public Person(String name, String gender, int age, int identify)
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.identify = identify;
	}
}
