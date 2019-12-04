package com.mxz.AbstractFactoryMethodPattern.Yellow;


import com.mxz.AbstractFactoryMethodPattern.Human;

/**
 * Created by Administrator on 2019/9/4.
 */
public abstract class YellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("YellowHuman...laugh");
    }

    @Override
    public void cry() {
        System.out.println("YellowHuman...cry");
    }

    @Override
    public void talk() {
        System.out.println("YellowHuman...talk");
    }
}
