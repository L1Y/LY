package com.wangzexin.javase.abstraction;

public class AdapterDemo {
    
    public void Interator(BaseAdapter adapter){
        
        int len = adapter.getCount();
        for(int i = 0; i<len; i++)
            adapter.getView(i);
    }
    
    public static void main(String[] args){
        AdapterDemo adapterDemo = new AdapterDemo();
        Adapter adapter = new Adapter();
        adapterDemo.Interator(adapter);
    }

}
