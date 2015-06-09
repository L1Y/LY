package com.aisiwei.javase.interfacedemo;

public class HttpConnection {

		public interface HttpListener
		{
			void onSuccess();
			void onFileNotExist();
			void Failure();
		}
		
		public HttpConnection()
		{
			
		}
		
		public static void doLogin(int arg, HttpListener listener)
		{
			if(arg == 200)
			{
				listener.onSuccess();
			}
			else if(arg == 404)
			{
				listener. onFileNotExist();
			}
			else if(arg == 500)
			{
				listener.Failure();
			}
		}
}
