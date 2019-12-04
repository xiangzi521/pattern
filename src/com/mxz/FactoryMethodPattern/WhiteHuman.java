package com.mxz.FactoryMethodPattern;

/**
 * Created by Administrator on 2019/9/4.
 */
public class WhiteHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("WhiteHuman...laugh");
    }

    @Override
    public void cry() {
        System.out.println("WhiteHuman...cry");
    }

    @Override
    public void talk() {
        System.out.println("WhiteHuman...talk");
    }
}
