package com.xurui.javase.review;

public class Student extends Person{
	private int sno;
	private String major;
	private int classno;
	private String school;
	
	public Student(){
		
	}
	
	public Student(String name,String gender,int age,String indentifg,int sno,String major,int classno,String school){
		super(name,gender,age,indentifg);
		this.sno = sno;
		this.major = major;
		this.classno = classno;
		this.school = school;
	}
	
	public void setSno(int sno){
		this.sno = sno;
	}
	
	public int getSno(){
		return sno;
	}
	
	public void setMajor(String major){
		this.major = major;
	}
	
	public String getMajor(){
		return major;
	}
	
	public void setClassno(int classno){
		this.classno = classno;
	}
	
	public int getClassno(){
		return classno;
	}
	
	public void setSchool(String school){
		this.school = school;
	}
	
	public String getSchool(){
		return school;
	}
	
	
	@Override
	public String getName(){
		return super.getName();
	}
	
	
	@Override
	public String toString(){
		return "学号: " + this.sno +"\n"+ "姓名: " + this.getName()+"\n"+ "性别: " + this.getGender()+"\n"+ "年龄: "+ this.getAge()+"\n" 
			  + "专业: " + this.major+ "\n"+ "班号: " + this.classno+"\n" +"学校: " + this.school+"\n"+"身份证: "+this.getIndentifg();
	}
	
}
