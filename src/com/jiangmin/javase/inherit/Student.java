package com.jiangmin.javase.inherit;

public class Student extends Person {
	private String number;
	private String major;
	private String clas;
	private String school;

	public Student() {

	}

	public Student(String number, String major, String clas, String school) {
		this.number = number;
		this.major = major;
		this.clas = clas;
		this.school = school;
	}

	public Student(String name) {
		super(name);
	}

	public Student(String name, String number, String major, String clas,
			String school) {
		this(number, major, clas, school);
		this.setName(name);
	}

	public Student(String name, int age, String gender, String identity,
			String number, String major, String clas, String school) {
		super(name, age, gender, identity);
		this.number = number;
		this.major = major;
		this.clas = clas;
		this.school = school;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String getName() {
		return super.getName() + "ѧ��";
	}

	@Override
	public String toString() {
		return "ѧ��:" + number + "\n����:" + getName() + "\n�Ա�:"
				+ super.getGender() + "\n����:" + super.getAge()
				+ "\n���֤����:" + super.getIdentity() + "\nרҵ:" + major
				+ "\n�༶:" + clas + "\nѧ��:" + school;
	}
}
