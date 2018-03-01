package com.tryingpfq.abstractFactory;

//抽象工厂
public interface CarFactory {
    public BenCar getBenzCar();
    public TeslaCar getTesalCar();
}
