package com.tryingpfq.simpleFactory;
//简单工厂模式的一个操作类
//测试
public class Operation {
    private double _numberA = 0;

    private double _numberB = 0;

    public double get_numberA() {
        return _numberA;
    }

    public void set_numberA(double _numberA) {
        this._numberA = _numberA;
    }

    public double get_numberB() {
        return _numberB;
    }

    public void set_numberB(double _numberB) {
        this._numberB = _numberB;
    }

    public  double GetResult() throws Exception {
        double result = 0;

        return result;
    }
}
