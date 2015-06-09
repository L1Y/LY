package com.tuyongkang.javase.inherit;

class Fu{
	int num;
	Fu(){
		num =10;
		System.out.println("Fu"+num);
	}

	Fu(int i){
		System.out.println("Fu"+i);
	}
}

class Zi extends Fu{
	Zi(){
		super();//子类构造方法里面隐藏有调用父类的无参构造方法
		//super(1);
		System.out.println("Zi" + num);
		return;//每个无返回值的方法或者构造方法都隐藏有return
	}
	
	Zi(int i){
//		super();//每一个子类的构造方法都隐藏有一个super方法来调用父类的无参构造方法
		super(3);//当需要调用无参构造方法时，必须明确说明要调用
		System.out.println("Zi"+i);
	}
	
}

public class InheritDemo {
	public static void main(String[] args){
//		Zi z = new Zi(2);

	}
}
