package com.panxiaoguang.javase.inherit;

class Fu{
	int num;
	//�����޲ι��췽��
	Fu(){
		num=10;
		System.out.println("Fu" + num);
	}
	//�����вι��췽��
	Fu(int i){
//		System.out.println("Fu" + i);
	}
	
	void show(){
		System.out.println("show fu");
	}
}

/*final*/ class Zi extends Fu{
	int num = 6;
	//�����޲ι��췽��
	Zi(){
		//super();//���๹�췽�����������е��ø�����޲ι��췽��
		//super(1);
//		System.out.println("Zi" + num);
//		System.out.println("Zi" + super.num);
//		return;//ÿ���޷���ֵ�÷������߹��췽����������return��
	}
	//�����вι��췽��
	Zi(int i){
		//super();//ÿ��һ������Ĺ��췽����������һ��super���������ø�����޲ι��췽��
		//super(3);//����Ҫ������ȷ���вι��췽��ʱ��������ȷ˵��Ҫ������һ��
		this();//this�ؼ��ֺ�super�ؼ��֣��ٹ��췽���ﶼֻ�ܴ����ڵ�һ�У����Ե���this()��ʱ�򣬾�����super().
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
