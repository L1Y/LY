package com.liduan.javase.inherit;

/**
 * 
 * @author liduan
 *	�����������Ĺ���
 */

class Fu{
	int num;
	Fu(){
		//num = 10;
		show();//��������ñ�������д���ķ���ʱ����ô���ǵ��������еķ���
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
		//super();//���๹�췽�����������е��ø�����޲ι��췽��
		//super(1);
//		super(1);
//		System.out.println("Zi" + num);
//		System.out.println("Zi" + super.num);
//		return;//ÿ���޷���ֵ�ķ������߹��췽����������return;
		num = 6;
		//show();
		//System.out.println(this);
	}
	
	Zi(int i){
		//super();//ÿ��һ������Ĺ��췽����������һ��super���������ø�����޲ι��췽��
		//super(3);//����Ҫ�����вι��췽��ʱ��������ȷ˵��Ҫ������һ��
		//this();//this�ؼ��ֺ�super�ؼ��֣��ڹ��췽���ﶼֻ�ܴ����ڵ�һ�С����Ե���this��ʱ�򣬾�û��super()��
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
