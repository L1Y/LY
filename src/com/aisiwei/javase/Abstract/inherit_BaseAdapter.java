package com.aisiwei.javase.Abstract;

public class inherit_BaseAdapter extends BaseAdapter{

	private int[] array = new int [10];
	
	public inherit_BaseAdapter()
	{
		
	}
	
	public void Adapter_array()
	{
		int len = array.length;
		for(int i = 0; i<len ; i++)
		{
			array[i] = i;
		}
	}
	
	public int getCounter()
	{
		return array.length;
	}
	
	public int getItem(int position)
	{
		return array[position];
	}
	
	public void getVeiw(int position)
	{
		System.out.println(array[position]);
	}

}
