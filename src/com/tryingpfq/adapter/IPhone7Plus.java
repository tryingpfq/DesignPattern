package com.tryingpfq.adapter;

public class IPhone7Plus {
     private LightningInterface lightningInterface;
     
     public IPhone7Plus(){
    	 
     }
     public IPhone7Plus(LightningInterface lightningInterface){
    	 this.lightningInterface=lightningInterface;
     }
     
     public void charge(){
    	 System.out.println("开始给我的IPhone7Plus充电吧");
    	 lightningInterface.chargeLigntning();
    	 System.out.println("充电完成了");
     }
	public LightningInterface getLightningInterface() {
		return lightningInterface;
	}
	public void setLightningInterface(LightningInterface lightningInterface) {
		this.lightningInterface = lightningInterface;
	}
     
    
}
