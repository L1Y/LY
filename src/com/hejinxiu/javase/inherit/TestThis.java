package com.hejinxiu.javase.inherit;

class Fu{
	Fu(){
		System.out.println("fu");
	}
}
class Zi extends Fu{
	Zi(){
	    super();
	    //super和this不能共存
		
		System.out.println("Zi");
	}
	Zi(int i){
		//this();
		System.out.println("Zi");
	}
}
public class TestThis {
	public static void main(String[] args){
	Zi z = new Zi();
	}
}
