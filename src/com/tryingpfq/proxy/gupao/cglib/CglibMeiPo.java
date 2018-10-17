package com.tryingpfq.proxy.gupao.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by trying on 2018/10/5.
 */
public class CglibMeiPo implements MethodInterceptor{

    //疑问
    //好像并没有持有被代理对象的引用
    public Object getInstance(Class clazz) throws Exception{
        Enhancer enhancer = new Enhancer();

        //把父类设置为谁
        //这一步就是告诉cglib，生成的子类需要继承哪个类
        enhancer.setSuperclass(clazz);

        //设置回调
        enhancer.setCallback(this);

        //第一步 生成源代码
        //第二步 编译成class文件
        //第三步
        return enhancer.create();
    }

    //同样是做一件字节码重组的事情
    //对于使用API的用户来说 是无感知的
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("我是GP媒婆："+" 给你找个异性");
        System.out.println("开始进行海选");
        System.out.println("---------------------");
        //这个obj的引用是cglib给我们new出来的
        //Cglib new出来的对象是被代理对象的子类(继承了我们自己写的那个类)
        //OOP 在new子类之前，实际上默认调用了super()方法的
        //new子类的同时，必须先new父类出来，这就相当于间接的持有了我们父类的引用
        //子类重写了父类的所有方法
        //我们改变了子类的某些属性，是可以间接的操作父类的属性的
        methodProxy.invokeSuper(obj,args);
        System.out.println("---------------------");
        System.out.println("如果合适的话，就准备办事");
        return null;
    }
}
