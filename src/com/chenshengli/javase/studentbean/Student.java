package com.chenshengli.javase.studentbean;


public class Student extends Person{
	
	private String no;
	private String major;
	private String cla;
	private String school;
	
	public Student() {
		
	}

	public Student(String no, String major, String cla, String school) {
		this.no = no;
		this.major = major;
		this.cla = cla;
		this.school = school;
	}
	
	public Student(String name, String gender, int age, String identify, String no, String major, String cla, String school) {
		super(name, gender, age, identify);
		this.no = no;
		this.major = major;
		this.cla = cla;
		this.school = school;
	}
	
	@Override
	public String getName() {
		return super.getName() + "学生";
	}
	
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
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
	public String toString(){
		return "姓名：" + super.getName() + "\n" + "学号：" + getNo() + "\n" +
				"性别：" + super.getGender() + "\n" + "年龄：" + super.getAge() + 
				"\n" + "省份证：" + super.getIdentify() + "\n" + "专业：" + getMajor() +
				"\n" +"班级：" + getCla() + "\n" + "学校：" + getSchool();
	}
}
