package com.tryingpfq.delegate;

/**
 * Created by trying on 2018/10/21.
 */
public class Dispatcher implements IExector {
    IExector exector;

    Dispatcher(IExector exector){
        this.exector = exector;
    }

    //项目经历 虽然他也有还行
    //但是他的工作职责不一样
    @Override
    public void doing() {
        //回调
        this.exector.doing();
    }
}
