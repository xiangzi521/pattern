package com.mxz.StrategyPattern;

/**
 * Created by Administrator on 2019/9/4.
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    //使用计谋了，看我出招了
    public void operate(){
        this.strategy.operate();
    }
}
