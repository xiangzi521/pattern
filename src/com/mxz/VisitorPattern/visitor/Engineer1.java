package com.mxz.VisitorPattern.visitor;

import java.util.Random;

/**
 * Created by Administrator on 2019/11/22.
 */
public class Engineer1 extends Staff {

    public Engineer1(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor1 visitor1) {
        visitor1.visit(this);
    }

    public int getCodeLine(){
        return new Random().nextInt(10*1000);
    }
}
