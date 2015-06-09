package com.zhenshuyu.javase.algorithm;

public   class BaseAdapterDemo extends BaseAdapter{
	int [] array={1,2,2,1,2,1,21,2,1,1};

	@Override
	public int getCount() {
		// TODO 自动生成的方法存根
		return array.length;
	}

	@Override
	public int getItem(int position) {
		
		return array[position];
	}


	@Override
	public  int getView(int position) {
	return	0;
		
	}

}
