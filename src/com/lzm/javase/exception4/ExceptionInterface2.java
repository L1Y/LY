package com.lzm.javase.exception4;

//��װִ���߼�����װ�࣬�ⲿ����ʵ�֣�
public class ExceptionInterface2 {
	public ExceptionInterface2() {
		// TODO Auto-generated constructor stub
	}
	public ExceptionInterface2(int x, ExceptionListener listener) {
		if (x >= 0 && x <= 10) {
			listener.myTry();
		} else if (x < 0 || x > 10) {
			listener.myCatch();
		}
		listener.myFinally();
	}
}
