package com.mxz.StrategyPattern;

/**
 * Created by Administrator on 2019/9/4.
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找人帮忙，让吴国太给孙权施加压力");
    }
}
