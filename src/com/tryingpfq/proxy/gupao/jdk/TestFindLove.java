package com.tryingpfq.proxy.gupao.jdk;

/**
 * Created by trying on 2018/9/22.
 * 动态代理基本原理
 1：拿到被代理对象的引用，然后获取它的接口
 2：JDK代理重新生成一个类，同时实现我们给的代理对象所实现的接口
 3：把被代理对象的引用也拿到了
 4：重新动态生成一个class字节码
 5：然后编译
 */
public class TestFindLove {
    public static void main(String[] args){
        //XiaoXingXing xiaoXingXing = new XiaoXingXing();
        try {
            Person person = (Person) new MeiPo().getInsObject(new XiaoXingXing());
            System.out.println("媒婆返回的对象 "+person.getClass());
            person.findLove();
            person.getSex();
        }catch (Exception e){
            e.printStackTrace();
        }

       System.out.println(" test ");
    }
}
