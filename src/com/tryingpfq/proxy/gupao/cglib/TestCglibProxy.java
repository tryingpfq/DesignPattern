package com.tryingpfq.proxy.gupao.cglib;

/**
 * Created by trying on 2018/10/13.
 */
public class TestCglibProxy {
    public static void main(String[] args) {
        //JDK动态代理是通过接口来进行强制转换的
        //生成以后的代理对象，可以强制转换为接口

        //CGLIB的动态代理是通过生成一个被代理对象的子类 然后重写父类的方法
        //生成以后的对象 可以强制转换为被代理的对象（也就是自己写的类）
        //子类引用赋值给父类
        try {
            YunZhongYu obj =(YunZhongYu) new CglibMeiPo().getInstance(YunZhongYu.class);
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
