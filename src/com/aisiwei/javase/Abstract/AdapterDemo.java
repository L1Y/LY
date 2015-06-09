package com.aisiwei.javase.Abstract;

import java.util.Arrays;

public class AdapterDemo {
	
	public static void main(Arrays[] args)
	{
		AdapterDemo ad = new AdapterDemo();
		BaseAdapter ab = new inherit_BaseAdapter();
		ad.Iterator(ab);
	}
	public void Iterator(BaseAdapter adapter)
	{
		for(int i =0; i<adapter.getCounter();i++)
		{
			adapter.getVeiw(i);
		}
		
		
	}
}
