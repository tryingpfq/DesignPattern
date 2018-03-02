package com.tryingpfq.adapter;
//定义一个荣耀10的安卓手机
public class Honor10 {
     private MiroUsbInterface miroUsbInterface;
     
     public Honor10(){
    	 
     }
     public Honor10(MiroUsbInterface miroUsbInterface){
    	 this.miroUsbInterface = miroUsbInterface;
     }
     public void charge(){
    	 System.out.println("开始给我的Honor10充电");
    	 miroUsbInterface.chargeWithMiroUsb();
    	 System.out.println("电已近充满，请结束充电");
     }
	public MiroUsbInterface getMiroUsbInterface() {
		 return miroUsbInterface;
	}

	public void setMiroUsbInterface(MiroUsbInterface miroUsbInterface) {
		this.miroUsbInterface = miroUsbInterface;
	}
     
}
