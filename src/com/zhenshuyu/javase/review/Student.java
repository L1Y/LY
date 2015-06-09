package com.zhenshuyu.javase.review;

public class Student extends Person {
	private String no;
	private String major;
	private String cla;
	private String school;
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
	
	
	public Student( String no, String major, String cla,
			String school) {
		
		this.no = no;
		this.major = major;
		this.cla = cla;
		this.school = school;
	}
	
	
	@Override
	public String getName() {
		return super.getName()+"Ñ§Éú";
	}

	
}
