package com.tryingpfq.abstractFactory;

//具体工厂
public class SportCarFactory implements CarFactory{

	@Override
	public BenCar getBenzCar() {
		
		return new BenzSporCar();
	}

	@Override
	public TeslaCar getTesalCar() {
		// TODO Auto-generated method stub
		return new TeslaBusinessCar();
	}
   
}
