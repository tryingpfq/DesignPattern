package com.tryingpfq.singleton;

//饿汉式
public class SingletonPattnner {
     private static final SingletonPattnner SingletonPattnner =new SingletonPattnner();
     
     private SingletonPattnner(){
    	 
     }
     public synchronized static SingletonPattnner getInstance(){
    	 return SingletonPattnner;
     }
}
