package com.wangxinghao.staff;

public class Student extends Person {
	private String studentId = null;
	private String major = null;
	private String cla = null;
	private String school = null;

	public String getStudentId() {
		return studentId;
	}

	public Student(String name, Gender gender, int age, String identification,
			String studentId, String major, String cla, String school) {
		super(name, gender, age, identification);
		this.studentId = studentId;
		this.major = major;
		this.cla = cla;
		this.school = school;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, Gender gender, int age, String identification) {
		super(name, gender, age, identification);
		// TODO Auto-generated constructor stub
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getCla() {
		return cla;
	}

	public void setCla(String cla) {
		this.cla = cla;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "姓名：" + getName() + "\n身份证：" + getIdentification() + "\n 年龄："
				+ getAge() + "\n性别:" + getGender() + "\n学校:" + getSchool();
	}

	@Override
	public String getName() {

		return super.getName() + "学生 ";
	}

}
