package com.tryingpfq.operationFactory;
//测试类
public class Main {
	public static void main(String[] args) {
		OperationAdd add=new OperationAdd();
		add.setValue1(9);
		add.setValue2(9);
		System.out.println(add.getResult());
	}

}
