package com.muxiaohan.java.review;
/*
Student
	��Ա������ѧ��,����,����
	���췽�����޲Σ�����
	��Ա������
		getXxx()/setXxx()
		ѧϰ�ķ�����
Teacher
	��Ա������Ա�����,����,����
	���췽�����޲Σ�����
	��Ա������
		getXxx()/setXxx()
		��ѧ�ķ�����

ͨ���򵥵ķ���������֪����ȡһ�����ࣺPerson�е����ݣ�
	����,����
	�޲Σ�����
	getXxx()/setXxx()
*/
public class PersonDemo {

	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(20);
		s.setClas("����03");
		s.setIdentifial("411324199501242258");
		s.setMajor("java");
		s.setName("Ľ�к�");
		s.setSchool("���");
		s.setSex("��");
		s.setSno(1215200036);
		String ss = s.identifialtoString("411324199501242258");
		System.out.println("����Ϊ"+s.getName());
		System.out.println("�Ա�"+s.getSex());
		System.out.println("����Ϊ"+s.getAge());
		System.out.println("ѧУΪ"+s.getSchool());
		System.out.println(ss);
		System.out.println("ѧ��Ϊ"+s.getSno());
		System.out.println("רҵΪ��"+s.getMajor());
		System.out.println("�༶Ϊ��"+s.getClas());
		
	}

}
