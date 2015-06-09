package com.muxiaohan.java.review;
/*
Student
	成员变量：学号,姓名,年龄
	构造方法：无参，带参
	成员方法：
		getXxx()/setXxx()
		学习的方法。
Teacher
	成员变量：员工编号,姓名,年龄
	构造方法：无参，带参
	成员方法：
		getXxx()/setXxx()
		教学的方法。

通过简单的分析：我们知道提取一个父类：Person中的内容：
	姓名,年龄
	无参，带参
	getXxx()/setXxx()
*/
public class PersonDemo {

	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(20);
		s.setClas("中信03");
		s.setIdentifial("411324199501242258");
		s.setMajor("java");
		s.setName("慕逍寒");
		s.setSchool("广大");
		s.setSex("男");
		s.setSno(1215200036);
		String ss = s.identifialtoString("411324199501242258");
		System.out.println("姓名为"+s.getName());
		System.out.println("性别："+s.getSex());
		System.out.println("年龄为"+s.getAge());
		System.out.println("学校为"+s.getSchool());
		System.out.println(ss);
		System.out.println("学号为"+s.getSno());
		System.out.println("专业为："+s.getMajor());
		System.out.println("班级为："+s.getClas());
		
	}

}
