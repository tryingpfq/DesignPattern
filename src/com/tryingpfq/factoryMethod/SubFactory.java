package com.tryingpfq.factoryMethod;

import com.tryingpfq.operationFactory.Operation;
import com.tryingpfq.operationFactory.OperationSub;

//减法类工厂
public class SubFactory implements IFactory{

	@Override
	public Operation CreateOption() {
		
		return new OperationSub();
	}

}
