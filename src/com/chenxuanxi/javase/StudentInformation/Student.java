/**
 * 
 */
package com.chenxuanxi.javase.StudentInformation;

/**
 * @author Daniel Chan
 *
 */
public class Student extends Person {
	
	private int no ;
	private String major;
	private int cla ;
	private String school;
	
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

	public int getCla() {
		return cla;
	}

	public void setCla(int cla) {
		this.cla = cla;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	/*
	 * ���� Student �ķ���
	 */
	public Student(String name, String gender,int age  , String identify,int no,String major 
			,int cla , String school){
		super(name,age,gender,identify);
		this.no = no ;
		this.major = major ;
		this.cla= cla ; 
		this.school = school;
	}
	
	public String getName(){
		return super.getName()+"ѧ��";
	}

	public String toString(){
		return "����:" + getName() + "\n" + "�Ա�:" + getGender() + "\n" + "����" + getAge()
		        + "\n" + "���֤:" + getIdentify() + "\n"  + "ѧ��:"+ getNo() + "\n" + "רҵ:"
				+ getMajor() + "\n" + "�༶:" + getCla()+ "\n" +"ѧУ:" + getSchool();
		}
	 

}


