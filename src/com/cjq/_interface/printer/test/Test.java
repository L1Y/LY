package com.cjq._interface.printer.test;

import com.cjq._interface.printer.ink.Color;
import com.cjq._interface.printer.ink.Grey;
import com.cjq._interface.printer.ink.InkBox;
import com.cjq._interface.printer.paper.A4Paper;
import com.cjq._interface.printer.paper.A5Paper;
import com.cjq._interface.printer.paper.Paper;
import com.cjq._interface.printer.print.Printer;

public class Test {

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    InkBox inkBox = new Grey();
    Paper paper = new A4Paper();
    Printer print = new Printer(inkBox, paper);

    inkBox = new Color();
    paper = new A5Paper();
    print = new Printer(inkBox, paper);
  }

}
