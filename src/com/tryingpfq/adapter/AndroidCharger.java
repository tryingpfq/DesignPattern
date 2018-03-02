package com.tryingpfq.adapter;
/**
 * 安卓设备充电器
 * @author trying
 *
 */
public class AndroidCharger implements MiroUsbInterface{

	@Override
	public void chargeWithMiroUsb() {
		System.out.println("使用Miro型充电器给我的安卓手机充电");
	}

}
