package com.yangqiuhua.javase.inherit;

public class Student extends Person{
	
	private String no;
	private String major;
	private int cla;
	private String school;
	
	public Student(){
		
	}
	
	public Student(String no, String major, int cla, String school){
		this.no = no;
		this.major = major;
		this.cla = cla;
		this.school = school;
	}
	
	public Student(String name, String gender, int age, String identify,String no, String major, int cla, String school){
		super(name, gender, age, identify);
		this.no = no;
		this.major = major;
		this.cla = cla;
		this.school = school;
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
	@Override
	public String getName(){
		return super.getName() + "ѧ��";
	}
	
	public String toString(){
		return "������" + getName()  +  "\n�Ա�" + super.getGender() 
				+ " \n���䣺" + super.getAge() + " \n���֤��" + super.getIdentify() 
				+ " \nѧ�ţ�" + getNo() + " \nרҵ ��" + getMajor() + " \n�༶��" + getCla() 
				+ " \nѧУ��" + getSchool();
	}
	
}
