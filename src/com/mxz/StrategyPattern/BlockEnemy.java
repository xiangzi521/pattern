package com.mxz.StrategyPattern;

/**
 * Created by Administrator on 2019/9/4.
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
