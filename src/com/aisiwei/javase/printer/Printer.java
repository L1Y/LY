package com.aisiwei.javase.printer;

import com.aisiwei.javase.Paper.Paper_size;
import com.aisiwei.javase.lik.LinkBox;

public class Printer {
	public void print(LinkBox color, Paper_size paper)
	{
		System.out.println(color.getColor() +"�Ĵ�ӡ������" + paper.getPaper() + "ֽ���ϴ�ӡ");
	}
}
