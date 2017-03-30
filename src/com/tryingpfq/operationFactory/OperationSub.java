package com.tryingpfq.operationFactory;

//减法
public class OperationSub extends Operation{

	@Override
	public double getResult() {
		
		return getValue1()-getValue2();
	}
    
}
