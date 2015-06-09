package com.zzc.javase.inherit;

public class Student extends Person {
	private long num;
	private String major;
	private int classes;
	private String school;
	
	
	public Student() {
		// TODO 自动生成的构造函数存根
	}

	public Student(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
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
		// TODO 自动生成的构造函数存根
	}

	@Override
	public String getName() {
		// TODO 自动生成的方法存根
		return super.getName() + " (学生)";
	}
	@Override
	public String toString(){
		String result;
		result = "姓名: "+ super.getName();
		result += "\n性别: " + getGender();
		result += "\n年龄: " + getAge();
		result += "\n身份证: " +getIdentify();
		result += "\n学校: " + getSchool();
		result += "\n学号: " + getNum();
		result += "\n班级: " + getClasses();
		result += "\n专业: " + getMajor();
		return result;
		/*return "姓名: "+ super.getName() +" \n性别: " + getGender() + " \n年龄: " + getAge() + " \n身份证: " +
				getIdentify() + "\n学校: " + getSchool() + " \n学号: " + getNum() + " \n班级: " + getClasses() + " \n专业: " + getMajor();*/
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
