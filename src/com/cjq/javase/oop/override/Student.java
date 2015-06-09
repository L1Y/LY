package com.cjq.javase.oop.override;

public class Student extends Person {

	private String school;
	private String cla;
	private String major;
	private int sno;

	/**
	 * ��дtoString()����
	 */
	@Override
	public String toString() {
		return "ѧ��     : " + this.getSno() + "\n����     : " + super.getName()
				+ "\nѧУ     : " + this.getSchool() + "\n�༶     : "
				+ this.getCla() + "\nרҵ     : " + this.getMajor()
				+ "\n�Ա�     : " + this.getGender() + "\n����     : "
				+ this.getAge() + "\n���֤: " + this.getIdentity();
	}

	/**
	 * ��дgetName()����
	 */
	@Override
	public String getName() {
		return super.getName() + "ͬѧ";
	}

	/**
	 * @param name
	 */
	public Student(String name) {
		super(name);
	}

	/**
	 * ���췽��
	 * 
	 * @param name
	 * @param gender
	 * @param age
	 * @param identity
	 */
	public Student(String name, String gender, int age, String identity,
			String school, String cla, String major, int sno) {
		super(name, gender, age, identity);
		this.school = school;
		this.cla = cla;
		this.major = major;
		this.sno = sno;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getCla() {
		return cla;
	}

	public void setCla(String cla) {
		this.cla = cla;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

}
