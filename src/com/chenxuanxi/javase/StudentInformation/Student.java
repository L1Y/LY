/**
 * 
 */
package com.chenxuanxi.javase.StudentInformation;

/**
 * @author Daniel Chan
 *
 */
public class Student extends Person {
	
	private int no ;
	private String major;
	private int cla ;
	private String school;
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getCla() {
		return cla;
	}

	public void setCla(int cla) {
		this.cla = cla;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	/*
	 * 定义 Student 的方法
	 */
	public Student(String name, String gender,int age  , String identify,int no,String major 
			,int cla , String school){
		super(name,age,gender,identify);
		this.no = no ;
		this.major = major ;
		this.cla= cla ; 
		this.school = school;
	}
	
	public String getName(){
		return super.getName()+"学生";
	}

	public String toString(){
		return "姓名:" + getName() + "\n" + "性别:" + getGender() + "\n" + "年龄" + getAge()
		        + "\n" + "身份证:" + getIdentify() + "\n"  + "学号:"+ getNo() + "\n" + "专业:"
				+ getMajor() + "\n" + "班级:" + getCla()+ "\n" +"学校:" + getSchool();
		}
	 

}


