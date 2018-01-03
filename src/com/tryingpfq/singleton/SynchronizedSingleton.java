package com.tryingpfq.singleton;

//线程安全的加锁
//其实这个会存在很大的问题  应为99%的时候不需要同步  显然这样效率是很低的
public class SynchronizedSingleton {
	//定义实类
	private static SynchronizedSingleton instance;
	
	//私有构造方法
	private SynchronizedSingleton(){
		
	}
    //对get方法进行加锁
    public static synchronized SynchronizedSingleton getInstance(){
    	if(instance==null){
    		instance=new SynchronizedSingleton();
    	}
    	return  instance;
    }
}
