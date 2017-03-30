package com.tryingpfq.operationFactory;

public class OperationMul extends Operation{

	@Override
	public double getResult() {
		
		return getValue1()*getValue2();
	}

}
