package com.yyw.javase.interfaces;

public class HttpConnection {
	/*
	public void onSuccess(){
		System.out.println("���ӳɹ�");
	}
	public void onFileNotExist(){
		System.out.println("����404\n��½ҳ�治����");
	}
	public void onFailure(){
		System.out.println("����ʧ��");
	}
	*/
	public static void doLogin(int arg, HttpListener listener){
		try{
			switch(arg){

			case 200:
				listener.onSuccess();
				
				break;
			case 404:
				listener.onFileNotExist();break;
			case 500:
				listener.onFailure();break;
			default:
				throw new Exception("hehe");
			}
		}catch(Exception e){
			e.toString();
		}
	}
	public static void doLogin(int arg, HttpListener listener, HttpListener1 listener1){
		doLogin(arg, listener);
		listener1.onSuccess();
	}
	
	public interface HttpListener {

		void onSuccess();
		void onFileNotExist();
		void onFailure();
	}
	public interface HttpListener1{
		void onSuccess();
	}


}
