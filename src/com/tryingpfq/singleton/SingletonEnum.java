package com.tryingpfq.singleton;

//可以直接用枚举就行了
//它不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
public enum SingletonEnum {
    INSTANCE;
	SingletonEnum(){
		
	}
}
