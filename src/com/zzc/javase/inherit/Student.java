package com.zzc.javase.inherit;

public class Student extends Person {
	private long num;
	private String major;
	private int classes;
	private String school;
	
	
	public Student() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public Student(String name) {
		super(name);
		// TODO �Զ����ɵĹ��캯�����
	}
	
	public Student(String name, String gender, int age, String identify, long num, String majou, int classes, String school) {
		super(name,gender,age,identify);
		this.num = num;
		this.major = majou;
		this.classes = classes;
		this.school = school;
	
	}

	public Student(String name, String gender, int age, String indentify) {
		super(name, gender, age, indentify);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public String getName() {
		// TODO �Զ����ɵķ������
		return super.getName() + " (ѧ��)";
	}
	@Override
	public String toString(){
		String result;
		result = "����: "+ super.getName();
		result += "\n�Ա�: " + getGender();
		result += "\n����: " + getAge();
		result += "\n���֤: " +getIdentify();
		result += "\nѧУ: " + getSchool();
		result += "\nѧ��: " + getNum();
		result += "\n�༶: " + getClasses();
		result += "\nרҵ: " + getMajor();
		return result;
		/*return "����: "+ super.getName() +" \n�Ա�: " + getGender() + " \n����: " + getAge() + " \n���֤: " +
				getIdentify() + "\nѧУ: " + getSchool() + " \nѧ��: " + getNum() + " \n�༶: " + getClasses() + " \nרҵ: " + getMajor();*/
	}

	public long getNum() {
		return num;
	}
	
	public void setNum(long num) {
		this.num = num;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String majou) {
		this.major = majou;
	}

	public int getClasses() {
		return classes;
	}

	public void setClasses(int classes) {
		this.classes = classes;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}


	
}
