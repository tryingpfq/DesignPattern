package com.tryingpfq.prototype;

import java.util.Date;

/**
 * Created by trying on 2018/10/25.
 * 原型模式
 */
public class Monkey {
    //身高
    protected int height;

    //体重
    protected int weight;

    //生日
    protected Date birthday;  //不是基本数据类型

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
