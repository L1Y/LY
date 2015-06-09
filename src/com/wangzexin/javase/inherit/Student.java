package com.wangzexin.javase.inherit;

public class Student extends Person{
    
    private String school;
    private String major;
    private String cla;
    private int number;
    
    public String getSchool() {
        return school;
    }
    
    public void setSchool(String school) {
        this.school = school;
    }
    
    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    public String getCla() {
        return cla;
    }
    
    public void setCla(String cla) {
        this.cla = cla;
    }
    
    public int getNumber() {
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public Student(){
        this.school = null;
        this.major = null;
        this.cla = null;
        this.number = 0;
    }
    
    public Student(String school){
        this.school = school;
    }

    public Student(String school, String major, String cla, int number) {
        this.school = school;
        this.major = major;
        this.cla = cla;
        this.number = number;
    }
    
    public Student(String school, String major, String cla, int number, String name, String gender, int age, String identify) {
        super(name, gender, age, identify);  
        this.school = school;
        this.major = major;
        this.cla = cla;
        this.number = number;
    }
        
    @Override
    public String getName(){
        return super.getName().concat(" ѧ��");
    }
    
    public String toString(){
        return "������"+getName()+"\n"+"���䣺"+getAge()+"\n"+"�Ա�"+getGender()+"\n"+"���֤��"+getIdentify()+"\n"+"ѧУ��"+getSchool()+"\n"+"רҵ��"+getMajor()+"\n"+"�༶��"+getCla()+"\n"+"ѧ�ţ�"+getNumber();
    }
    
   
}
