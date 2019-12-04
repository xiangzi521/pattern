package com.mxz.ObserverPattern.advance;

/**
 * Created by Administrator on 2019/9/9.
 */
public class client {
    public static void main(String[] args) {
        Observer liSi = new LiSi();
        Observer wangSi = new WingSi();
        ZhangSan zhangSan = new ZhangSan();

        //定义出韩非子
        HanFeiZi hanFeiZi = new HanFeiZi();

        //我们后人根据历史，描述这个场景，有三个人在观察韩非子
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(zhangSan);

        //然后这里我们看看韩非子在干什么
        hanFeiZi.haveBreakfast();
    }
}
