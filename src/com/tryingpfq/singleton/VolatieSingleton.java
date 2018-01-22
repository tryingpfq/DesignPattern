package com.tryingpfq.singleton;

//使用volatile
public class VolatieSingleton {
      private static volatile VolatieSingleton singleton;
      
      private VolatieSingleton(){
    	  
      }
      
      public static VolatieSingleton getSingleton(){
    	  if(singleton==null){
    		  synchronized(VolatieSingleton.class){
    			  if(singleton==null){
    				  singleton=new VolatieSingleton();
    			  }
    		  }
    	  }
    	  return singleton;
      }
}
