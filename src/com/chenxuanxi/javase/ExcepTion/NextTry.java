/**
 * 
 */
package com.chenxuanxi.javase.ExcepTion;

/**
 * @author Daniel
 *
 */
public class NextTry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			/*try��Ƕ��try-catch*/
			try{
				int [] b = {1,2,3};//��������ָ���쳣
				System.out.println(b[4]);
			}catch(Exception e){ //e Ϊ�β� ���Դ�����Ϊһ����������
				System.out.println(e.toString());
			}
			int a = 4/0; //���������쳣
		}catch(Exception e){ //e Ϊ�β� ���Դ�����Ϊһ����������
			System.out.println(e.toString());
			/*catch��Ƕ��try-catch*/
			try{
				int [] a = {1,2,3}; //��������ָ���쳣
				System.out.println(a[4]);
			}catch(Exception d){
				System.out.println(d.toString());
			}
		}
	}

}
