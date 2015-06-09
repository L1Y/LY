package com.lzm.javase.exception4;

//��װִ���߼�����װ�࣬����ʵ�֣�
public class ExceptionInterface implements ExceptionListener {
	
	public ExceptionInterface() {
	}
	
	public ExceptionInterface(int x, ExceptionListener listener) {
		if (x >=0 && x <= 10) {
			listener.myTry();
		} else if (x > 10 || x < 0) {
			listener.myCatch();
		}
		listener.myFinally();
	}

	@Override
	public void myTry() {
		System.out.println("try");
	}

	@Override
	public void myCatch() {
		System.out.println("catch");
	}

	@Override
	public void myFinally() {
		System.out.println("finally");
	}

}
