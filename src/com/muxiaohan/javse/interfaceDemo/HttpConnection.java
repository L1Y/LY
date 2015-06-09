package com.muxiaohan.javse.interfaceDemo;

public class HttpConnection {
	public interface HttpListener{
		public void onSuccess();
		public void onFileNotExit();
		public void onFailure();
	}
	public void dologin(int args,HttpListener listener){
		switch(args){
		case 200:
			listener.onSuccess();
			break;
		case 404:
			listener.onFileNotExit();
			break;
		case 500:
			listener.onFailure();
			break;
		default:
			System.out.println("������Ĳ��ڴ�Ӧ�ó���Χ֮��");
		}
		
	}
}
