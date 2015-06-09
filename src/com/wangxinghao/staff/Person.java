package com.wangxinghao.staff;

public class Person {
	private String name = null;
	private com.wangxinghao.staff.Person.Gender gender = null;
	private int age;
	private String identification = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public com.wangxinghao.staff.Person.Gender getGender() {
		return gender;
	}

	public void setGender(com.wangxinghao.staff.Person.Gender lailia) {
		this.gender = lailia;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public Person(String name, com.wangxinghao.staff.Person.Gender gender, int age,
			String identification) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.identification = identification;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public enum Gender {
		MALE, FEMALE;
	}

}
