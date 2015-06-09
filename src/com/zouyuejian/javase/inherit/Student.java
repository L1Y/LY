package com.zouyuejian.javase.inherit;

public class Student extends Person{
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
	/**
	 * ��дgetName����
	 */
	@Override
	public String getName(){
		return super.getName() + "ѧ��";
	}
	/**
	 * 
	 */
	@Override
	public String toString(){
		return "ѧ�ţ�" + getNo()+"\n������"+super.getName() + "\n�Ա�" + getGender() +"\n���䣺" + getAge()
				+ "\n�༶��" + getCla() + "\n���֤���룺" + getIdentify() + "\nרҵ��" + getMajor() + "\nѧУ��" + getSchool();
	}
	
	public Student(String name, String gender, int age, String identify, String no, String major, String cla, String school) {
		super(name, gender, age, identify);
		this.no = no;
		this.major = major;
		this.cla = cla;
		this.school = school;
	}
	
	public Student(String name, String gender, int age, String identify) {
		super(name, gender, age, identify);
		
	}
}
