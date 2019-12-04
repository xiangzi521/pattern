package com.mxz.AbstractFactoryMethodPattern.BlackHuman;


import com.mxz.AbstractFactoryMethodPattern.Human;

/**
 * Created by Administrator on 2019/9/4.
 */
public abstract class BlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("BlackHuman...laugh");
    }

    @Override
    public void cry() {
        System.out.println("BlackHuman...cry");
    }

    @Override
    public void talk() {
        System.out.println("BlackHuman...talk");
    }
}
