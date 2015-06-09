package com.zhongguohua.javase.person;

public class Student extends Person{
	private String no;
	private String major;
	private String cla;
	private String school;
//	
//	public Student(String no){
//		this.no = no;
//	}
//	
//	public Student(String no,String major){
//		this(no);
//		this.major = major;
//	}
//	
//	public Student(String no,String major,String cla){
//		this(no,major);
//		this.cla = cla;
//	}
	
	public Student(String name,String gender,String age,String identify,String no,String major,String cla,String school){
		super(name,gender,age,identify);
		this.no = no;
		this.major = major;
		this.cla = cla;
		this.school = school;
	}
	
	public void setNo(String no){
		this.no = no;
	}
	
	public String getNo(){
		return no;
	}
	
	public void setMajor(String major){
		this.major = major;
	}
	
	public String getMajor(){
		return major;
	}
	
	public void setCla(String cla){
		this.cla = cla;
	}
	
	public String getCla(){
		return cla;
	}
	
	public void setSchool(String school){
		this.school = school;
	}
	
	public String getSchool(){
		return school;
	}
	@Override
	public String getName(){
		return super.getName() + "ѧ��";
	}
	@Override
	public String toString(){
		return "ѧ�ţ�" + no + "\n������" + super.getName() + "\n�Ա�" + super.getGender() + "\n���䣺" + super.getAge() + "\nѧУ��" + school + "\nרҵ��" + major + "\n�༶:"
				+ cla + "\n���֤�ţ�" + super.getIdentify();
	}
}
