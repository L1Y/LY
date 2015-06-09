package com.zzc.javase.review;

public class IdCardDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdCardDemo id = new IdCardDemo();
		String str = "34052419800101001X";
		id.isValidID(str);
		}
	
	public void isValidID(String str){
		int[]cardArr = new int[18];
		int[]arr = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		int sum = 0;
		
		for(int i=0;i < cardArr.length-1;i++){
			cardArr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		
		for(int i=0;i< arr.length;i++){
			arr[i] = arr[i] * cardArr[i];
			sum = sum + arr[i];
		}
		
		int remainder = sum % 11;//得到余数
		String strArr[] = {"1","0","X","9","8","7","6","5","4","3","2","1"};
		
		if(strArr[remainder].charAt(0) == str.charAt(17)){//char类型的0不等于int类型的0
			System.out.println("该身份证合法");
		}
		else{
			System.out.println("该身份证不合法");
		}
		
	}
}
