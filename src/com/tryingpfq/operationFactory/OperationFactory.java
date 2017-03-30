package com.tryingpfq.operationFactory;
public class OperationFactory {
	public static Operation createOpertion(String operation){
		Operation oper=null;
		switch(operation){
		case "+":
			oper=new OperationAdd();
			break;
		case "-":
			oper=new OperationSub();
			break;
		case "*":
			oper=new OperationMul();
		case "/":
			oper=new OperationDiv();
			break;
		default:
			throw new UnsupportedOperationException("不支持该操作");
		}
		return oper;
	}
}
