package com.tryingpfq.factoryMethod;

import com.tryingpfq.operationFactory.Operation;
import com.tryingpfq.operationFactory.OperationAdd;

//加法类工厂
public class AddFactory implements IFactory{

	@Override
	public Operation CreateOption() {
		
		return new OperationAdd();
	}

}
