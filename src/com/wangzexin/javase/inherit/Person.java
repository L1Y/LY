package com.wangzexin.javase.inherit;

public class Person {
    
    private String name;
    private String gender;
    private int age;
    private String identify;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getIdentify() {
        return identify;
    }
    
    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public Person(){
        this.name = null;
        this.gender = null;
        this.age = 0;
        this.identify = null;
    }
    
    public Person(String name){
        this.name = name;
    }
    
    public Person(String name, String gender, int age, String identify){
        this(name);
        this.gender = gender;
        this.age = age;
        this.identify = identify;
    }

}
