package com.mxz.VisitorPattern.visitor;

import java.util.Random;

/** 基类
 * Created by Administrator on 2019/11/22.
 */
public abstract class Staff {
    public String name;
    public int kpi;

    public Staff(String name) {
        this.name = name;
        this.kpi = new Random().nextInt(10);
    }

    public abstract void accept(Visitor1 visitor1);
}
