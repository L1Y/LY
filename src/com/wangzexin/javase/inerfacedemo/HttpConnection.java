package com.wangzexin.javase.inerfacedemo;

public class HttpConnection {

    interface HttpListenner{
        void onSuccess();
        void onFileNotExist();
        void onFailure();
    }
    
    
    public static void doLogin(int arg, LoginActivity loginActivity){
        
        switch(arg){
        case 200:
            loginActivity.onSuccess();
            break;
        case 404:
            loginActivity.onFileNotExist();
            break;
        case 500:
            loginActivity.onFailure();
            break;
        }
        
    }

}
