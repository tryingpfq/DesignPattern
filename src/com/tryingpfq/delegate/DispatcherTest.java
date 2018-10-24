package com.tryingpfq.delegate;

/**
 * Created by trying on 2018/10/21.
 */
public class DispatcherTest {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher(new ExectorA());

        //看上去是经理在干活
        //其实是普通员工在干活
        dispatcher.doing();
    }
}
