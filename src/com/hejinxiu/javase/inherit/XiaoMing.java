package com.hejinxiu.javase.inherit;

public class XiaoMing extends Person {
	private int number;
	private String major;
	private String cls;
	private String school;
	
	public XiaoMing(){
		
	}
	public XiaoMing(String name,String gender, int age, String indenify){
		super(name,gender,age,indenify);
	}
	public XiaoMing(String name,String gender, int age, String indenify,int number, String major, String cls, String school){
		this(name,gender,age,indenify);
		this.number = number;
		this.major = major;
		this.cls = cls;
		this.school = school;
	}
	
	public void setNumber(int number){
		this.number = number;
	}
	
	public void setMajor(String major){
		this.major = major;
	}
	
	public void setCls(String cls){
		this.cls = cls;
	}
	public void setSchool(String school){
		this.school = school;
	}
	public int getNumber(){
		return number;
	}
	public String getMajor(){
		return major;
	}
	public String getCls(){
		return cls;
	}
	public String getSchool(){
		return school;
	}
	@Override
	/**
	 * ��д
	 */
	public String getName(){
		return super.getName() + "ѧ��";
	}
	
	@Override
	/**
	 * ��д
	 */
	public String toString(){
		return "ѧ��������:::= "+getName()+"\n����:::="+getAge()+"\nѧ�����Ա�:::="+getGender()+"\nѧ������ݺ���:::="+getIdenify()+"\nѧ����ѧ��:::="+getNumber()
				+"\nѧ����רҵ::="+getMajor()+"\nѧ���İ༶::="+getCls()+"\nѧ����ѧУ:::="+getSchool();
	}
	
	
}
