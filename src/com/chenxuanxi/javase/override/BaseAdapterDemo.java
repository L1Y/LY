/**
 * 
 */
package com.chenxuanxi.javase.override;

/**
 * @author Daniel Chan
 *
 */
public class BaseAdapterDemo {
	/**
	 * ����������������ֵķ���
	 */
	public void Iterator(BaseAdapterEx adapter){
		for(int i = 0 ; i<adapter.getCount();i++){
			adapter.getView(i);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BaseAdapterDemo BAD = new BaseAdapterDemo();
		BaseAdapterEx adapter = new BaseAdapterEx() ;
		BAD.Iterator(adapter);
		
	}

}
