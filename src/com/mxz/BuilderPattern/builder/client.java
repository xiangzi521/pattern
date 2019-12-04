package com.mxz.BuilderPattern.builder;

/**
 * 建造者模式
 * Created by Administrator on 2019/9/5.
 */
public class client {
    public static void main(String[] args) {
        Director director = new Director();
//1W辆A类型的奔驰车
        for (int i = 0; i < 3; i++) {
            director.getABenzModel().run();
            System.out.println("一台生产完成.............");
        }
        System.out.println("================>>");
//100W辆B类型的奔驰车
        for (int i = 0; i < 3; i++) {
            director.getBBenzModel().run();
            System.out.println("一台生产完成.............");
        }
        System.out.println("================>>");
//1000W量C类型的宝马车
        for (int i = 0; i <3; i++) {
            director.getCBMWModel().run();
            System.out.println("一台生产完成.............");
        }

    }
}
