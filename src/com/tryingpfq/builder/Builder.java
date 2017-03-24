package com.tryingpfq.builder;

public abstract class Builder {
	//code2 抽象构造者
	protected Product product=new Product();
	
    public abstract void bulidKeyBoard();
    
    public abstract void bulidMouse();
    
    public abstract void bulidDisplay();
    
    public abstract void bulidmainEngine();
    
    public Product result(){
    	return product;
    }

}
