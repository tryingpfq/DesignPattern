package com.tryingpfq.factoryMethod;

import com.tryingpfq.operationFactory.Operation;
import com.tryingpfq.operationFactory.OperationDiv;

//除法类工厂
public class DivFactory implements IFactory {

	@Override
	public Operation CreateOption() {
		
		return new OperationDiv();
	}

}
