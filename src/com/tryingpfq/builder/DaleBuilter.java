package com.tryingpfq.builder;

public class DaleBuilter extends Builder{
	//���幹����
	private Product product=new Product();
	@Override
	public void bulidKeyBoard() {
		product.setKeyBoard("���� ����");	
	}
	@Override
	public void bulidMouse() {
		product.setMouse("���� ���");	
	}
	@Override
	public void bulidDisplay() {
		product.setDisplay(" ��ʾ��");	
	}
	@Override
	public void bulidmainEngine() {
		product.setMainEngine("���� ����");		
	}
	@Override
	public Product result(){
		return product;
	}
}
