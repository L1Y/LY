package com.lizhenglin.javase.abstractDemo;

public class AdapterDemo
{
  private BaseAdapter baseAdapter;
  public AdapterDemo(BaseAdapter baseAdapter)
  {
    this.baseAdapter = baseAdapter;
  }
  
  public void Iterator()
  {
    for(int i = 0; i < 10; i++)
    {
      System.out.println(baseAdapter.getView(i));
    }
  }
  
  
  
  public static void main(String[] args)
  {
    AdapterDemo adapterDemo = new AdapterDemo(new ArrayAdapter());
    adapterDemo.Iterator();
  }
  
}
