package com.zhongguohua.exam;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 0,b=0;
		int[] arrayOne = {2,1,4,5,6};
		int[] arrayTwo = {2,4,7,1,6};
		int len = arrayOne.length;
		int len2 = arrayTwo.length;
		for(int i = 0;i < len;i++){
			for(int j = 0;j < len2;j++){
				if(arrayOne[i] == arrayTwo[i]){
					a++;
				}
				else if(arrayOne[i] == arrayTwo[j]){
					b++;
				}
				else{
					continue;
				}
			}
		}
		System.out.print("a = " + a + ",b = " + b);
	}

}
