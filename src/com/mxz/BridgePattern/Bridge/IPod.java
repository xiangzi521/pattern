package com.mxz.BridgePattern.Bridge;

/**
 * Created by Administrator on 2019/9/5.
 */
public class IPod extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出的iPod是这个样子的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的iPod卖出去了...");
    }
}
