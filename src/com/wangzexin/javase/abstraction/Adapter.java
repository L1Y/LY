package com.wangzexin.javase.abstraction;

import java.util.Random;

public class Adapter extends BaseAdapter{
    
    private int[] array = new int[10];
    
    
    public Adapter(){
        Random random = new Random();
        int len = array.length;
        for(int i = 0; i<len; i++)
            array[i] = random.nextInt(100);
    }
    
    public Adapter(int[] array){
        this.array = array;
    }
    
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return array.length;
    }
    
    @Override
    public int getItem(int position) {
        // TODO Auto-generated method stub
        return array[position];
    }
    
    @Override
    public void getView(int position){
        System.out.println(array[position]);
    }
}
