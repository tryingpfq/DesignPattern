package com.tryingpfq.singleton;
//懒汉式 线程不安全

public class Emperor {
	private static Emperor emperor=null;
	
	private Emperor(){
		
	}
	public static Emperor getInstance(){
		if(emperor==null){
			emperor=new Emperor();
		}
		return emperor;
	}
	
	public static void emperorInfo(){
		System.out.println("只有这个皇帝，有什么名字可以叫的呢");
	}

}
