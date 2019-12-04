package com.mxz.StrategyPattern;

/**
 * 策略模式
 * 同一个接口 三个不同的实现类
 * Created by Administrator on 2019/9/4.
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        System.out.println("拆第一个");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("拆第二个");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("拆第三个");
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
