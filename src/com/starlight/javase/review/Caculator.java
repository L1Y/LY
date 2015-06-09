/**
 * 
 */
package com.starlight.javase.review;

/**
 * @author Flying Starlight
 *
 */
public class Caculator {

      /**
       * @param args
       */
      private int x = 0; // represents left operator
      private int y = 0; // represents right operator
      private char operator = '0';
      private int r = 0; // represents the result
      private int flag = 0;

      public Caculator(int a, int b, char ch) {
            setX(a);
            y = b;
            operator = ch;
      }

      public boolean isNumeric(String s) {
            char[] ch = s.toCharArray();
            for (char a : ch) {
                  if (a >= '0' && a <= '9') {
                  } else {
                        return false;// �����ǰ��дreturn true����ô��ֻҪ��һ���������֣����ж�Ϊ��
                  }
            }
            return true;

      }

      public int convertToInt(String str) {
            int i = 0;
            if (isNumeric(str)) {
                  i = Integer.valueOf(str).intValue();
                  flag++;
            } else {
                  System.out.println("��������ַ����Ϸ�������������");
            }
            return i;
      }

      public boolean isValidOperator(char ch) {
            char[] ValidOp = { '+', '-', '*', '/' };
            for (char checker : ValidOp) {
                  if (ch == checker) {
                        operator = ch;
                        flag++;
                        return true;
                  }
            }
            System.out.println("���������������Ϸ�");
            return false;
      }

      public void calting(char op, int x, int y) {
            if (op == '+') {
                  r = x + y;
            } else if (op == '-') {
                  r = x - y;
            } else if (op == '*') {
                  r = x * y;
            } else if (op == '/') {
                  if (y == 0) {
                        System.out.println("������ĳ�������");
                  } else {
                        r = x / y;
                  }
            }
      }

      /**
       * @backup public void plus(int x, int y){ r = x + y; }
       * 
       *         public void subtract(int x, int y){ r = x - y; }
       * 
       *         public void multiply(int x, int y){ r = x * y; }
       * 
       *         public void divide(int x, int y){ r = x / y; }
       * 
       *         //public void
       * @return
       */

      public int getResult() {
            return this.r;
      }

      /**
       * @return x
       */
      public int getX() {
            return x;
      }

      /**
       * @param x
       *              Ҫ���õ� x
       */
      public void setX(int x) {
            this.x = x;
      }

      public int getY() {
            return y;
      }

      public void setY(int y) {
            this.y = y;
      }

      public char getOperator() {
            return operator;
      }

      public void setOperator(char operator) {
            this.operator = operator;
      }

      public int getR() {
            return r;
      }

      public void setR(int r) {
            this.r = r;
      }

      public int getFlag() {
            return flag;
      }

      public void setFlag(int flag) {
            this.flag = flag;
      }
      

}
