package com.lzm.javase.person;

public class Student extends Person {
	private int number;
	private String magor;
	private String className;
	private String school;
	
	public Student() {
		super();
	}
	public Student(String name) {
		super(name);
	}
	public Student(String name, String gender, int age, String identify, 
			int number, String magor, String className, String school) {
		super(name, gender, age, identify);
		setNumber(number);
		setMagor(magor);
		setClassName(className);
		setSchool(school);
	}
	
	/**
	 * 覆写父类方法
	 */
	@Override
	public String getName() {
		return 	super.getName();
	}
	@Override
	public String toString() {
		
		return " 学号：" + this.getNumber() + "\n" + "姓名：" + super.getName() + "\n"
				+ "性别：" + this.getGender() + "\n" + "年龄：" + this.getAge() + "\n"
				+ "专业：" + this.getMagor() + "\n" + "班级：" + this.getClassName() + "\n"
				+ "学校：" + this.getSchool() + "\n" + "身份证：" + this.getIdentify();
	}
	
	/**
	 * getter和setter
	 * @param number
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setMagor(String magor) {
		this.magor = magor;
	}
	public String getMagor() {
		return magor;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassName() {
		return className;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getSchool() {
		return school;
	}
}
