package com.panxiaoguang.javase.inherit;

/*
 *
 *@author panxiaoguang
 *
 *�����ࣺ������˵������ʵ�ֵ��ࡣ
 *�﷨���ࣺ���η� + abstract class + ����{ }
 *    ���������η� + abstract + ����ֵ���� + �������ƣ�����
 *    
 *�ص㣺
 *  1�������ܱ�ʵ����
 *  2�����󷽷�ֻ��������û��ʵ�֣� ͬʱ��abstract�ؼ������Σ����ǳ��󷽷�
 *  3����������������Ѹ����еĳ��󷽷�ȫ�����ǣ���д�����ܱ�ʵ���������������໹�ǳ�����
 *  4�������������зǳ��󷽷����ǳ����಻�ܴ��ڳ��󷽷�
 *  
 *abstract class Ȯ��
 *
 *   ����
 *   1�������������й��췽����          ÿ�����ж��й��췽��
 *       �����У�ֻ��ͨ�������еĹ��췽��ʹ��super�����ø�ֵ
 *   2����������Բ�������󷽷���
 *      ���ԣ���ʾ���ֻ��ͨ���̳���ʹ�á����磺HttpSevlet
 *   3������ؼ���abstract��������Щ�ؼ��ֹ��档
 *       final���ε��಻�ܱ��̳���abstract�෴
 *       static ���εķ��������ԣ���������෽���������ԡ�����Ҫͨ��ʵ���������ø÷���������
 *       private �ɷ�������Ϊ���಻�ɼ�������abstract��Ҫ�󷽷�������ɼ���
 *   4����������һ�������ͬ�㣿
 *       ��ͬ�㣺����������������ģ���Ҫ�����ڲ����巽����ʵ������
 *       ��ͬ�㣺
 *           1��һ�����Ǿ�������һ��������������ǲ���������
 *           2��һ�����ǲ�������󷽷���ֻ�ܶ���ǳ��󷽷���������ȿ��Զ�����󷽷���Ҳ���Զ���ǳ��󷽷���
 *           3��һ�������ܹ���ʵ�����ģ������ܡ�
 *��ϰ           
 *    1������һ��������BaseAdapter,������һ������ֵΪint�ĳ��󷽷�getCount(),����ֵΪObject��getItem(int position)���󷽷�������ֵΪObject��getView(int position)���󷽷�.
 *    2������һ��AdapterDemo�ࡣ��ӵ��һ��
 */

abstract class Ȯ��{
    private String name;
    
    public Ȯ��(){
    	
    }
    
    public Ȯ��(String name){
    	this.name = name;
    }
    
	abstract void ��();
	
	/*abstract void eat();*/
}

/*abstract*/ class �� extends Ȯ��{
	//���η� static �������� ��������;
	public static int i=0;//�����public Ȩ�޵Ļ�������ȫ�ֱ���
	public ��(){
		super();
	}
	
	public ��(String name){
		super(name);
	}
	
	@Override
	void ��(){
		System.out.println("����");
	}	
}

class �� extends Ȯ��{
	
	@Override
	void ��(){
		System.out.println("��");
}
	
public class AbstractDemo {
	
		public void main(String[] args) {
			�� dog = new ��();
			dog.��();
			//dog.i;
			//��.i
			
			�� wolf = new ��();
			wolf.��();
			
	//		Ȯ�� qk = new Ȯ�� ("quan");
		}
	}
}
