package com.cjq._interface.login;

public class HttpConnection {

  public void doLogin(int arg, HttpListener listener) {
    if (arg == 200) {
      listener.onSuccess();
    } else if (arg == 404) {
      listener.onFileNotExist();
    } else if (arg == 500) {
      listener.onFailure();
    }
  }

  public interface HttpListener {

    public void onSuccess();

    public void onFileNotExist();

    public void onFailure();
    
  }

}
