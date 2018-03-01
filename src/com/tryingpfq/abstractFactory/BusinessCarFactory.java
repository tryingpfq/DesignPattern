package com.tryingpfq.abstractFactory;

public class BusinessCarFactory implements CarFactory{

	@Override
	public BenCar getBenzCar() {
		
		return new BenzBusinessCar();
	}

	@Override
	public TeslaCar getTesalCar() {
		// TODO Auto-generated method stub
		return new TeslaBusinessCar();
	}

}
