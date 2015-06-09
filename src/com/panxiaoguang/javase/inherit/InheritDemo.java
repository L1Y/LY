package com.panxiaoguang.javase.inherit;

class Fu{
	int num;
	//父类无参构造方法
	Fu(){
		num=10;
		System.out.println("Fu" + num);
	}
	//父类有参构造方法
	Fu(int i){
//		System.out.println("Fu" + i);
	}
	
	void show(){
		System.out.println("show fu");
	}
}

/*final*/ class Zi extends Fu{
	int num = 6;
	//子类无参构造方法
	Zi(){
		//super();//子类构造方法里面隐藏有调用父类的无参构造方法
		//super(1);
//		System.out.println("Zi" + num);
//		System.out.println("Zi" + super.num);
//		return;//每个无返回值得方法或者构造方法都隐藏有return；
	}
	//子类有参构造方法
	Zi(int i){
		//super();//每个一个子类的构造方法都隐藏有一个super方法来调用父类的无参构造方法
		//super(3);//当需要调用明确的有参构造方法时，必须明确说明要调用哪一个
		this();//this关键字和super关键字，再构造方法里都只能存在于第一行，所以当有this()的时候，就咩有super().
		System.out.println("Zi" + i);
	}
	
	Zi(int i,int j){
		this(i);
	}
	
	@Override
	void show(){
		System.out.println("zi show");
	}
}

public class InheritDemo {
	public static void main(String[] args){
//		Zi z=new Zi(2);
		Zi z = new Zi();
		z.show();
	}
}

//
