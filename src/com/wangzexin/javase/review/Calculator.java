package com.wangzexin.javase.review;

public class Calculator {
    private int x;
    private int y;
    private String mark;
    
    public int getResult(){
        if("+".equalsIgnoreCase(mark))
            return x + y ;
        else if("-".equalsIgnoreCase(mark))
            return x-y;
        else if("*".equalsIgnoreCase(mark))
            return x*y;
        else if("/".equalsIgnoreCase(mark))
            if(y == 0){
                System.out.println("y��Ϊ����ʱ������Ϊ0");
                return 0;
            }
            else 
                return x/y;
        else 
            return 0;
    }
    
    
    public Calculator (){
        this.x = 0;
        this.y = 0;
        this.mark = null;
    }
    /**
     * 
     * @param x
     * @param y
     * @param mark
     */
    public Calculator (int x, int y, String mark){
        this.x = x;
        this.y = y;
        this.mark = mark;
    }
    
    
    public int getX(){
        return x;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public boolean setX(String str){
        if(str != null && str.length() != 0){
            if(isNumber(str)){
                int value = Integer.parseInt(str);
                setX(value);
                return true;
            }else{
                return false;
            }
        }else{
            System.out.println("X����Ϊ�գ�����������");
            return false;
        }
    }
    
    public int getY(){
        return y;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public boolean setY(String str){
        if(str != null && str.length() != 0){
            if(isNumber(str)){
                int value = Integer.parseInt(str);
                setY(value);
                return true;
            }else{
                return false;
            }
        }else{
            System.out.println("Y����Ϊ�գ�����������");
            return false;
        }
    }
    
    public String getMark(){
        return mark;
    }
    
    public void setMark(String mark){
        this.mark = mark;
    }

    public boolean isNumber(String str){
        char[] strChar = str.toCharArray();
        int len = str.length();
        for(int i = 0;i < len;i++){
            int item = strChar[i];
            if('0' <= item && item <= '9'){
                
            }else{
               System.out.println("�����������������");
               return false;
            }
        }
        
        return true;
    }
    
    public boolean isMark(String str){
        String[] array = {"+","-","*","/"};
        
        for(String item:array){
            if(item.equalsIgnoreCase(str))
                return true;
        }
        
        return false;
    }
    
}
