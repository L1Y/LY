package com.chenxiaofeng.impl;

public interface HttpListener {
	void onSuccess();
	void onFileNotExist();
	void onFailure();
}
