package com.tryingpfq.proxy.gupao.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by trying on 2018/9/22.
 * 媒婆
 */
public class MeiPo implements InvocationHandler{
    private Person target;

    //获取被代理人的个人资料
    public Object getInsObject(Person person) throws Exception{
        this.target = person;

        //通过反射获取接口
        Class clazz = target.getClass();

        System.out.println("被代理对象的Class是 "+ clazz);

        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("你的性别是："+this.target.getName()+ " 给你找个异性");
        System.out.println("开始进行海选");
        System.out.println("---------------------");

        //this.target.findLove();
        method.invoke(target,args);
        System.out.println("---------------------");
        System.out.println("如果合适的话，就准备办事");
        return null;
    }

}
