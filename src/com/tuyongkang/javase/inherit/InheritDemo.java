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
		super();//���๹�췽�����������е��ø�����޲ι��췽��
		//super(1);
		System.out.println("Zi" + num);
		return;//ÿ���޷���ֵ�ķ������߹��췽����������return
	}
	
	Zi(int i){
//		super();//ÿһ������Ĺ��췽����������һ��super���������ø�����޲ι��췽��
		super(3);//����Ҫ�����޲ι��췽��ʱ��������ȷ˵��Ҫ����
		System.out.println("Zi"+i);
	}
	
}

public class InheritDemo {
	public static void main(String[] args){
//		Zi z = new Zi(2);

	}
}
