package com.aisiwei.javase.person;

public class Student extends Person
{
	private int no;
	private String major;
	private String class_;
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
	public String getClass_() {
		return class_;
	}
	public void setClass_(String class_) {
		this.class_ = class_;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	
	public Student()
	{
		
	}
	
	public Student(String name, String gender, int age, int identify,int no,String major,String class_,String school)
	{
		super(name,gender,age,identify);
		this.no = no;
		this.major = major;
		this.class_ = class_;
		this.school = school;
	}
	

	
	@Override
	public String getName()
		{
		   return super.getName() + "ѧ��";	
		}

	public String toString()
	{
		return "ѧ��:"+no+"\n������"+super.getName()+"\n�Ա�"+super.getGender()+"\n���䣺"+super.getAge()+"\n���֤��"+super.getIdentify()+"\nרҵ��"+major+"\n�༶��"+class_+"\nѧУ:"+school;
	}
	
}
