package com.mxz.ObserverPattern.common;

/**
 * Created by Administrator on 2019/9/9.
 */
public class client {
    public static void main(String[] args) throws InterruptedException {
       /* LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();
        watch watchBreakfast = new watch(hanFeiZi,liSi,"breakfast");
        watchBreakfast.start();
        watch watchFun = new watch(hanFeiZi,liSi,"fun");
        watchFun.start();

        //Thread.sleep(10);
        hanFeiZi.haveBreakfast();
        //Thread.sleep(10);
        hanFeiZi.haveFun()*/;

        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();


    }
}
