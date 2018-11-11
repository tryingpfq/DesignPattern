package com.tryingpfq.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Tryingpfq
 * @Time 2018/11/11 15:20
 * 类似spring中单列的实现方式，基于Map
 * 将类名注册，下次直接从里面取
 */
public class Singleton3 {

    private static Map<String,Singleton3> map = new HashMap<>();
    static {
        Singleton3 single = new Singleton3();
        map.put(single.getClass().getName(),single);
    }

    //保护的默认构造方法
    protected Singleton3(){}

    //静态工程方法，返回此类唯一实例
    public static Singleton3 getInstance(String name){
        if(name == null) name = Singleton3.class.getName();

        if(map.get(name) == null){
            try{
                map.put(name,(Singleton3) Class.forName(name).newInstance());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return map.get(name);
    }

}
