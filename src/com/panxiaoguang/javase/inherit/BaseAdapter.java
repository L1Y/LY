package com.panxiaoguang.javase.inherit;

public abstract class BaseAdapter {
	public abstract int getCount();
	public abstract int getItem(int position);   //获取数组或集合中的一个元素
	public abstract void getView(int position);  //
}

/*class A extends BaseAdapter {
	int[] array = new int[10];//new int[]{1,3}-----new int[10]
	
	public void initArray(){
		for(int i=0;i<10;i++)
			array[i] = i;
	}

	@Override
	public int getCount() {
		return 0;
	}

	@Override
	public int getItem(int position) {
		return 0;
	}

	@Override
	public void getView(int position) {
		return 0;
	}
}

 class AdapterDemo(){
	public int Iterator(BaseAdapter adapter){
		System.out.println("getView()");
	}
	
}*/
