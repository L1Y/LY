package com.cjq._interface.printer.print;

import com.cjq._interface.printer.ink.InkBox;
import com.cjq._interface.printer.paper.Paper;

public class Printer {

  public Printer(InkBox inkBox, Paper paper) {
    System.out.println(inkBox.gerColor() + "的打印机正在" + paper.getPaper() + "上打印。");
  }

}
