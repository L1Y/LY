package com.fengdi.javase.exception;

public class HttpConnection {
	public void doLogin(int num, HttpListener b) {
		if (num == 200) {
			b.onSuccess();
		} else if (num == 404) {
			b.onFailure();
		} else if (num == 500) {
			b.onFileNotExist();
		}
	}


public interface HttpListener {
	public void onSuccess();

	public void onFailure();

	public void onFileNotExist();
}
}