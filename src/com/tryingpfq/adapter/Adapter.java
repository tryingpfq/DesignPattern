package com.tryingpfq.adapter;
//设配器 将MiroUsb接口转为Lightning
public class Adapter implements LightningInterface{
    private MiroUsbInterface miroUsbInterface;
    public Adapter(){
    	
    }
    public Adapter(MiroUsbInterface miroUsbInterface){
    	this.miroUsbInterface=miroUsbInterface;
    }
	@Override
	public void chargeLigntning() {
		miroUsbInterface.chargeWithMiroUsb();	
	}
	public MiroUsbInterface getMiroUsbInterface() {
		return miroUsbInterface;
	}
	public void setMiroUsbInterface(MiroUsbInterface miroUsbInterface) {
		this.miroUsbInterface = miroUsbInterface;
	}
  
	
}
