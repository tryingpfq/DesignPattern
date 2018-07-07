package com.tryingpfq.adapter;
//定义客户端进行测试
public class Main {
	public static void main(String[] args) {
		IPhone7Plus iphone7Plus =new IPhone7Plus(new AppleCharger());
		iphone7Plus.charge();
		
		System.out.println("-----------------");
		
		Honor10 honor10 =new Honor10(new AndroidCharger());
		honor10.charge();
		
		
		System.out.println("-----------------");
		
		Adapter adapter =new Adapter(new AndroidCharger());
		IPhone7Plus newIphone =new IPhone7Plus();
		newIphone.setLightningInterface(adapter);
		 newIphone.charge();
	}
 
}
