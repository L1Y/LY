/**
 * 
 */
package com.chenxuanxi.javase.exam;

/**
 * @author Daniel Chan
 *
 */
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				int[] arrone = { 2, 1, 4, 5, 6 };
				int[] arrtwo = { 2, 4, 7, 1, 6 };
				//实现索引相同且值相同
				int a=0;
				int len=arrone.length;
				for (int i = 0; i < len; i++) {
					if (arrone[i]==arrtwo[i]) {
						a++;
					}
				}
				System.out.println("索引相同且值相同:"+a);
				//实现索引不同但索引值相同
				int b=0;
				int wide = arrtwo.length;
				for (int i = 0; i < wide; i++) {
					for (int j = 0; j < len; j++) {
						if (arrone[i]==arrtwo[j]&&i!=j) {
							b++;
						}
					}
					
				}
				System.out.println("实现索引不同但索引值相同:"+b);
			}
		}

