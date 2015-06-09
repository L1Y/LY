package com.lzm.javase.exception4;

//封装执行逻辑（封装类，外部具体实现）
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
