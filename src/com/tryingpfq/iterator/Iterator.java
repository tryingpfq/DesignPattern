package com.tryingpfq.iterator;

//定义迭代器接口
public interface Iterator <E>{
	boolean hasNext();
	
	E next();
	
	default void remove(){
		throw new UnsupportedOperationException("remove");
	}
}
