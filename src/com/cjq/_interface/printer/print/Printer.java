package com.cjq._interface.printer.print;

import com.cjq._interface.printer.ink.InkBox;
import com.cjq._interface.printer.paper.Paper;

public class Printer {

  public Printer(InkBox inkBox, Paper paper) {
    System.out.println(inkBox.gerColor() + "�Ĵ�ӡ������" + paper.getPaper() + "�ϴ�ӡ��");
  }

}
