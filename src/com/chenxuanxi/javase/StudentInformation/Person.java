/**
 * 
 */
package com.chenxuanxi.javase.StudentInformation;

/**
 * @author Daniel Chan
 *
 */
public class Person {
	
	private String name ; 
	private String gender ; 
	private int age ; 
	private String identify ;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender(){
		return gender ;
	}
	
	public void setGender(String gender){
		this.gender = gender ;
	}
	
	public int getAge(){
		return age ;
	}
	
	public void setAge(int age){
		this.age=age;
	}

	public String getIdentify(){
		return identify;
	}
	
	public void setIdentify(String identify){
		this.identify=identify ;
	}
	
	public Person(String name){
		this.name=name ;
	}
	
	public Person( int age , String gender , String identify){
		this.age=age ; 
		this.gender=gender;
		this.identify=identify;
	}
	
	public Person(String name,int age , String gender , String identify){
		this(age,gender,identify);
		this.name=name;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
