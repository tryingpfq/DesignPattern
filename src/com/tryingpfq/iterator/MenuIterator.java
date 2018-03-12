package com.tryingpfq.iterator;

//定义一个具体的迭代器
public class MenuIterator implements Iterator{
	
	String[] foods;
	int position =0;
	
	 public MenuIterator(String[] foods) {
		this.foods=foods;
	}
	

	@Override
	public boolean hasNext() {
		
		return position != foods.length;
	}

	@Override
	public Object next() {
		String food=foods[position];
		position += 1;
		return food;
	}

}
