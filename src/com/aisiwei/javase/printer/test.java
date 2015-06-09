package com.aisiwei.javase.printer;

import com.aisiwei.javase.Paper.*;

import com.aisiwei.javase.lik.*;



public class test {
   public static void main(String[] args)
   {
	   Printer printer = new Printer();
	   Paper_size paper = new A4Paper();
	   LinkBox color = new Color();
	   printer.print(color,paper);
	   paper = new B5Paper();
	   color = new Gray();
	   printer.print(color,paper);
   }
}
