package com.panxiaoguang.javase.inherit;


public class Student extends Person{
	private String no;
	private String major;
	private String cla;
	private String school;
	public String getNo(){
		return no;
	}
	public void setNo(String no){
		this.no=no;
	}
	
	public String getMajor(){
		return major;
	}
	public void setMajor(String major){
		this.major=major;
	}
	
	public String getCla(){
		return cla;
	}
	public void setCla(String cla){
		this.cla=cla;
	}
	
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	
}
