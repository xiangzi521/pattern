package com.mxz.VisitorPattern.visitor;

import java.util.Random;

/**
 * Created by Administrator on 2019/11/22.
 */
public class Manager1 extends Staff {

    public Manager1(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor1 visitor1) {
        visitor1.visit(this);
    }

    public int getProduce(){
        return new Random().nextInt(10);
    }
}
