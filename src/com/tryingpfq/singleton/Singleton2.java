package com.tryingpfq.singleton;

/**
 * Created by trying on 2018/10/21.
 * 经典的单例实现
 * 利用静态内部类
 * 这种写法，即解决安全问题，也解决性能问题
 *
 */
public class Singleton2 {

    //先声明一个静态内部类
    //private 私有的保证别人不能修改
    //static 保证全局唯一
    private static class LazyHolder{
        //final 为了防止内部错误操作
        private static final Singleton2 INSTANCE  = new Singleton2();
    }

    //私有构造方法
    private Singleton2(){}

    //同样提供静态方法获取实例
    //final 确保别人不能修改
    public static final Singleton2 getInstance(){
        return LazyHolder.INSTANCE;
    }

}
