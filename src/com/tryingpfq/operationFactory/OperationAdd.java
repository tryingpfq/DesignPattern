package com.tryingpfq.operationFactory;

public class OperationAdd extends Operation{

	@Override
	public double getResult() {
		
		return getValue1()+getValue2();
	}

}
