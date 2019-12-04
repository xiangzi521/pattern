package com.mxz.ObserverPattern.Observable;

import java.util.Observer;
/**
 * Created by Administrator on 2019/9/9.
 */
public class clientObeservable {
    public static void main(String[] args) {
        Observer liSi = new LiSiObservable();
        Observer wangSi = new WingSiObservable();
        //定义出韩非子
        HanFeiZiObservable hanFeiZi = new HanFeiZiObservable();

        //我们后人根据历史，描述这个场景，有三个人在观察韩非子
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);

        //然后这里我们看看韩非子在干什么
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
