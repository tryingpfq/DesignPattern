package com.tryingpfq.adapter;

public class AppleCharger implements LightningInterface{

	@Override
	public void chargeLigntning() {
		System.out.println("使用Lightning充电器给我的苹果手机充电");
		
	}
}
