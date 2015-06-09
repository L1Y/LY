package com.liduan.javase.inherit;

/**
 * 
 * @author liduan
 *	创建子类对象的过程
 */

class Fu{
	int num;
	Fu(){
		//num = 10;
		show();//当父类调用被子类重写过的方法时，那么就是调用子类中的方法
		//System.out.println(this);
		//System.out.println("Fu" + num);
	}
	
	Fu(int i){
		System.out.println("Fu" + i);
	}
	
	void show(){
		System.out.println("fu show");
	}
}

class Zi extends Fu{
	//int num = 6;
	Zi(){
		//super();//子类构造方法里面隐藏有调用父类的无参构造方法
		//super(1);
//		super(1);
//		System.out.println("Zi" + num);
//		System.out.println("Zi" + super.num);
//		return;//每个无返回值的方法或者构造方法都隐藏有return;
		num = 6;
		//show();
		//System.out.println(this);
	}
	
	Zi(int i){
		//super();//每个一个子类的构造方法都隐藏有一个super方法来调用父类的无参构造方法
		//super(3);//当需要调用有参构造方法时，必须明确说明要调用哪一个
		//this();//this关键字和super关键字，在构造方法里都只能存在于第一行。所以当有this的时候，就没有super()。
		System.out.println("Zi" + i);
	}
	
	Zi(int i, int j){
	//	this(i);
	}

	
	void show(){
		System.out.println("zi show..." + num);
	}
}

public class InheritDemo {
	public static void main(String[] args){
//		Zi z = new Zi(2);
		Zi z = new Zi();
		//z.show();
		//Fu fu = new Fu();
		InheritDemo id = new InheritDemo();
		id.show(z);
	}
	
	public void show(Fu fu){
		fu.show();
	}
}
