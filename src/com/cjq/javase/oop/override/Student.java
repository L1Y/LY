package com.cjq.javase.oop.override;

public class Student extends Person {

	private String school;
	private String cla;
	private String major;
	private int sno;

	/**
	 * 重写toString()方法
	 */
	@Override
	public String toString() {
		return "学号     : " + this.getSno() + "\n姓名     : " + super.getName()
				+ "\n学校     : " + this.getSchool() + "\n班级     : "
				+ this.getCla() + "\n专业     : " + this.getMajor()
				+ "\n性别     : " + this.getGender() + "\n年龄     : "
				+ this.getAge() + "\n身份证: " + this.getIdentity();
	}

	/**
	 * 重写getName()方法
	 */
	@Override
	public String getName() {
		return super.getName() + "同学";
	}

	/**
	 * @param name
	 */
	public Student(String name) {
		super(name);
	}

	/**
	 * 构造方法
	 * 
	 * @param name
	 * @param gender
	 * @param age
	 * @param identity
	 */
	public Student(String name, String gender, int age, String identity,
			String school, String cla, String major, int sno) {
		super(name, gender, age, identity);
		this.school = school;
		this.cla = cla;
		this.major = major;
		this.sno = sno;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getCla() {
		return cla;
	}

	public void setCla(String cla) {
		this.cla = cla;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

}
