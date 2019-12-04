package com.mxz.AbstractFactoryMethodPattern;

/**
 * Created by Administrator on 2019/9/4.
 */
public interface HumanFactory {
    //制造黄色人类
    public Human createYellowHuman();
    //制造一个白色人类
    public Human createWhiteHuman();
    //制造一个黑色人类
    public Human createBlackHuman();
}
