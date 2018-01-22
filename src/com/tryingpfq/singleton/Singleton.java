package com.tryingpfq.singleton;

//双重校验锁
//减小加锁范围  可以大大提高效率的
public class Singleton {
    private static Singleton singleton;
    
    private Singleton(){
    	
    }
    
    public static Singleton getSingleton(){
    		if(singleton==null){
    			synchronized (Singleton.class) {
					if(singleton==null){
						singleton=new Singleton();
					}
				}
    		}
    		return singleton;
    }
}
