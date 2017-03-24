package com.tryingpfq.builder;

public class LenovoBuilter extends Builder{
	//具体构造者
	private Product product=new Product();
	@Override
	public void bulidKeyBoard() {
		product.setKeyBoard("联想 键盘");	
	}
	@Override
	public void bulidMouse() {
		product.setMouse("联想 鼠标");	
	}
	@Override
	public void bulidDisplay() {
		product.setDisplay(" 显示器");		
	}
	@Override
	public void bulidmainEngine() {
		product.setMainEngine("联想 主机");
	}	
	@Override
	public Product result(){
		return product;
	}

}
