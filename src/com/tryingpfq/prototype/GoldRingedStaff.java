package com.tryingpfq.prototype;

import java.io.Serializable;

/**
 * Created by trying on 2018/10/25.
 */
public class GoldRingedStaff implements Serializable {
    private float height = 100;  //长度

    private float diameter = 10; //直径

    /**
     * 变大
     */
    public void grow(){
        this.height = height * 2;
        this.diameter = diameter * 2;
    }

    /**
     * 变小
     */
    public void shrink(){
        this.height /= 2;
        this.diameter /= 2;
    }
}
