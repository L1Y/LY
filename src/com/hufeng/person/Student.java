package com.hufeng.person;

public class Student extends Person {
	protected String no;
	protected String najor;
	protected String cla;
	protected String school;

	public String getNo() {
		return no;
	}

	public void setNO(String no) {
		this.no = no;
	}

	public String getNajor() {
		return najor;
	}

	public void set(String najor) {
		this.najor = najor;
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

	public Student() {

	}

	public Student(int age, String name, String idenify, String gender) {
		super(age, name, idenify, gender);
	}

	public Student(int age, String name, String idenify, String gender, String no,
			String najor, String school, String cla) {
		this(age, name, idenify, gender);
		this.no = no;
		this.cla = cla;
		this.najor = najor;
		this.school = school;
	}

	@Override
	public String getName() {

		return super.getName() + "ѧ��";

	}

	@Override
	public String toString() {

		return "ѧ�ţ�" + getNo() + '\n' + "������" + getName() + '\n' + "�Ա�"
				+ getGender() + '\n' + "ѧУ��" + getSchool() + '\n' + "רҵ��"
				+ getNajor() + '\n' + "�༶��" + getCla() + '\n' + "���䣺" + getAge() + '\n' + " ���֤��" + getIdenify();
	}
}
