package com.zhenshuyu.javase.review;

public class StudentDemo extends Student {

	public static void main(String[] args) {
		Person  person  =new Person();
		StudentDemo student =new StudentDemo("15", "���", "10", "sanya" ,"�Ӻ�", "10", 18, "130402...");
		System.out.println(student.toString());
		
	}
	

	
	
	public StudentDemo(String no, String major, String cla, String school,String name, String gender, int age, String identity) {
		super(no, major, cla, school);
		
		// TODO �Զ����ɵĹ��캯�����
	}

	
	

}
