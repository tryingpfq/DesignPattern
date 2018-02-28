package com.tryingpfq.factoryMethod;

import com.tryingpfq.operationFactory.Operation;
import com.tryingpfq.operationFactory.OperationAdd;

public class Main {
     
   public static void main(String[] args) {
	   IFactory factory=new AddFactory();
	   Operation operationAdd = factory.CreateOption();
	   operationAdd.setValue1(1);
	   operationAdd.setValue2(2);
	   System.out.println(operationAdd.getResult());
   }   
}
