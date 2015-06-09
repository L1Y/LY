package com.aisiwei.javase.interface_;

public class test {
	public static void main(String[] args)
	{
		Usb usb = new Udisk();
		usb.service();
		usb = new Print();
		usb.service();
		
	}

}
