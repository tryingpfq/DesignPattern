package com.tryingpfq.prototype;

import java.io.*;
import java.util.Date;

/**
 * 用来拷贝复杂的对象（字节流复制） 深度克隆
 * super.cole()  默认浅克隆 只复制基本数据类型和String
 * Created by trying on 2018/10/25.
 * 齐天大圣
 */
public class TheGreatestSage extends Monkey implements Cloneable ,Serializable {
    //金工棒
    GoldRingedStaff staff;

    public TheGreatestSage(){
        this.staff = new GoldRingedStaff();
        this.birthday = new Date();
        this.height = 150;
        this.weight = 30;
    }

    public Object clone(){  //重写clone方法  //字节流复制 不走构造方法的
        try {
            //序列化
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            TheGreatestSage copy = (TheGreatestSage) ois.readObject();
            copy.setBirthday(new Date());
            bos.close();
            oos.close();
            bis.close();
            ois.close();

            return copy;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        }
        return null;
    }
    //变化
    public void change(){
        TheGreatestSage copySage = (TheGreatestSage) clone();
        System.out.println("大圣的生日："+ this.getBirthday().getTime());
        System.out.println("克隆大圣的生日：" + copySage.getBirthday().getTime());
        System.out.println("是否为同一个对象：" + (this == copySage));
        System.out.println("大圣本身持有的金工棒与克隆后是否为同一个对象"+ (this.getStaff() == copySage.getStaff()));
    }


    public GoldRingedStaff getStaff() {
        return staff;
    }

    public void setStaff(GoldRingedStaff staff) {
        this.staff = staff;
    }
}
