package com.tryingpfq.builder;

public class DaleBuilter extends Builder{
	//具体构造者
	private Product product=new Product();
	@Override
	public void bulidKeyBoard() {
		product.setKeyBoard("戴尔 键盘");	
	}
	@Override
	public void bulidMouse() {
		product.setMouse("戴尔 鼠标");	 
	}
	@Override
	public void bulidDisplay() {
		product.setDisplay(" 戴尔显示屏");	
	}
	@Override
	public void bulidmainEngine() {
		product.setMainEngine("戴尔 主机");		
	}
	@Override
	public Product result(){
		return product;
	}
}
