package com.wangzexin.javase.review;

import java.util.Scanner;

public class CalculatorDemo {
    
    public static void main(String[] args){
        
        Calculator cal = new Calculator();
        boolean isSetX = false;
        
        while(true){
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            
            if(isSetX && "=".equalsIgnoreCase(str)){
                System.out.println(cal.getX() + cal.getMark() + cal.getY() + "=" + cal.getResult());
                cal.setX(cal.getResult());
                isSetX = true;
            }else if("c".equalsIgnoreCase(str)){
                System.out.println("程序已重置");
                cal.setX(0);
                cal.setY(0);
                cal.setMark(null);
                isSetX = false;
            }else if("q".equalsIgnoreCase(str)){
                System.out.println("程序已退出，感谢使用！");
                scanner.close();
                break;
            }else{
                if(!isSetX && !cal.isMark(str)){
                    isSetX = cal.setX(str);
                }
                if(cal.isMark(str)){
                    cal.setMark(str);
                }
                if(cal.getMark()!=null && !cal.isMark(str)){
                    cal.setY(str);
                }
            }
        }
        
    }

}
