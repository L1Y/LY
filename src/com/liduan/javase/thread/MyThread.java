package com.liduan.javase.thread;

public class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println("this is my first thread");
		int i = 0;
		while(i < 100){
			i++;
			System.out.println("i" + i);
		}
	}
	//main�������߳�
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		//mt.start();//start����ֻ�������̣߳�����ʲôʱ��ȥִ��run������Ĵ�����أ�Ҫ�ȵ����߳�����CPU�Ŀ���Ȩ�Ż�ִ��
					//start����ֻ�Ǹ��߳��򣬿��Ա������ˣ�������һ����start����������ִ��run��������Ĵ���
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		t.setPriority(8);
		mt.start();
		t.start();
		//System.out.println("mt�����ȼ�����" + mt.getPriority());
		/*
		 * �����mr�߳����������кܶ����أ��������ȼ������߿��������̻߳�ȡcpu����Ȩ�ĸ���
		 * */
		
	}

}
