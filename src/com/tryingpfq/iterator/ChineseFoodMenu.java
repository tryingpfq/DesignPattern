package com.tryingpfq.iterator;

//定义一个具体的容器
public class ChineseFoodMenu implements Mumu{
	
	private String[] foods =new String[4];
	private int position =0;
	

	@Override
	public void add(String name) {
		foods[position]= name;
		
	}

	@Override
	public Iterator getIterator() {
		
		return new MenuIterator(this.foods);
	}

}
