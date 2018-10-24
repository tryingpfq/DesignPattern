package com.tryingpfq.delegate;

/**
 * Created by trying on 2018/10/21.
 * 委派模式 公司经理委托员工完成任务
 *
 */
public interface IExector {
    //具体执行任务
    //在公司中，员工执行任务
    //一周之内必须完成
    void doing();
}
