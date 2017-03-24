package com.tryingpfq.builder;

public class Director {
	//指挥者
	public void construct(Builder builder){
		builder.bulidDisplay();
		builder.bulidKeyBoard();
		builder.bulidKeyBoard();
		builder.bulidmainEngine();
	}

}
