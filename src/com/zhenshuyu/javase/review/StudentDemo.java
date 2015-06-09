package com.zhenshuyu.javase.review;

public class StudentDemo extends Student {

	public static void main(String[] args) {
		Person  person  =new Person();
		StudentDemo student =new StudentDemo("15", "软件", "10", "sanya" ,"子涵", "10", 18, "130402...");
		System.out.println(student.toString());
		
	}
	

	
	
	public StudentDemo(String no, String major, String cla, String school,String name, String gender, int age, String identity) {
		super(no, major, cla, school);
		
		// TODO 自动生成的构造函数存根
	}

	
	

}
