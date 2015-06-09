package com.fengdi.javase.review;

public class Student extends Person {
	private int no;
	private String major;
	private String cla;
	private String school;

	@Override
	public String getName() {
		return super.getName() + "ͬѧ";

	}

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

	public Student(String name, String gender, int age, String identity,
			int no, String major, String cla, String school) {
		super(name, gender, age, identity);
		this.no = no;
		this.major = major;
		this.cla = cla;
		this.school = school;
	}
	@Override
	public String toString(){
		return  "������" + super.getName() + "\n�Ա�" + super.getGender() + "\n��ͣ�" + super.getAge() + "\n���֤��" + super.getIdentity() +"\nѧ�ţ�" + this.getNo() +
				"\nרҵ��" + this.getMajor()+"\n�꼶��" + this.getCla() + "\nѧУ��" + this.getSchool() ; 
				 
				
		
	}	
	
	public static void main(String[] args){
		Student S = new Student("���" , "��" , 24  , "42900419911002471X" , 89757 , "ģ��" ,"007" , "�ϲ���");
		
		System.out.print(S);
	}
	
	
	
	
	
	
}
