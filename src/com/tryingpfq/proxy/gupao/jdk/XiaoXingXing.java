package com.tryingpfq.proxy.gupao.jdk;

/**
 * Created by trying on 2018/9/22.
 */
public class XiaoXingXing implements Person{
    private String sex = "女";
    private String name = "小星星";

    @Override
    public void findLove() {
        System.out.println("我叫："+this.name+"性别：" + this.sex+" 我找对象的要求");
        System.out.println("高富帅");
        System.out.println("有房有车");
        System.out.println("身高180,体重70KG");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
