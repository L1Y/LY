package com.liduan.javase.interfacedemo;

/**
 * ¿ò¼Ü´úÂë
 * @author Administrator
 *
 */
public class HttpConnection {
	public void doLogin(int arg, HttpListener listener){
		if(arg == 200){
			listener.onSuccess();
		}else if(arg == 404){
			listener.onFileNotExist();
		}else if(arg == 500){
			listener.onFailure();
		}
	}
	public void doLogin(int arg, HttpListener listener, HttpListener1 listener1){
		doLogin(arg, listener);
		listener1.onSuccess();
	}
	
	public interface HttpListener{
		public void onSuccess();
		public void onFailure();
		public void onFileNotExist();
	}
	
	public interface HttpListener1{
		public void onSuccess();
	}
}
