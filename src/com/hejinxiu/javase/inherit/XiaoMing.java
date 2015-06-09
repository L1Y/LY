package com.hejinxiu.javase.inherit;

public class XiaoMing extends Person {
	private int number;
	private String major;
	private String cls;
	private String school;
	
	public XiaoMing(){
		
	}
	public XiaoMing(String name,String gender, int age, String indenify){
		super(name,gender,age,indenify);
	}
	public XiaoMing(String name,String gender, int age, String indenify,int number, String major, String cls, String school){
		this(name,gender,age,indenify);
		this.number = number;
		this.major = major;
		this.cls = cls;
		this.school = school;
	}
	
	public void setNumber(int number){
		this.number = number;
	}
	
	public void setMajor(String major){
		this.major = major;
	}
	
	public void setCls(String cls){
		this.cls = cls;
	}
	public void setSchool(String school){
		this.school = school;
	}
	public int getNumber(){
		return number;
	}
	public String getMajor(){
		return major;
	}
	public String getCls(){
		return cls;
	}
	public String getSchool(){
		return school;
	}
	@Override
	/**
	 * 重写
	 */
	public String getName(){
		return super.getName() + "学生";
	}
	
	@Override
	/**
	 * 重写
	 */
	public String toString(){
		return "学生的姓名:::= "+getName()+"\n年龄:::="+getAge()+"\n学生的性别:::="+getGender()+"\n学生的身份号码:::="+getIdenify()+"\n学生的学号:::="+getNumber()
				+"\n学生的专业::="+getMajor()+"\n学生的班级::="+getCls()+"\n学生的学校:::="+getSchool();
	}
	
	
}
