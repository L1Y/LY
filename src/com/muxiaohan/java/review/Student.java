package com.muxiaohan.java.review;

public class Student extends Person{
	
	private int Sno;
	private String major;
	private String clas;
	private String School;
	
	public Student(){}
	
	public Student(int Sno,String major,String clas,String School,String name,String sex,int age,
			String identifial){
		super(name,sex,age,identifial);
		this.Sno = Sno;
		this.major = major;
		this.clas = clas;
		this.School = School;
	}
	public void getMessage(String name,String sex,String major,int Sno){
		System.out.println();
	}

	public int getSno() {
		return Sno;
	}

	public void setSno(int sno) {
		Sno = sno;
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
		return School;
	}

	public void setSchool(String school) {
		School = school;
	}
	//@Override
	public String getName(String name){
		
		return name+"学生";
		
	}
	@Override
	public String identifialtoString(String identifial){
		return identifial.toString()+"为身份证号";
	}
	
	


	

}
