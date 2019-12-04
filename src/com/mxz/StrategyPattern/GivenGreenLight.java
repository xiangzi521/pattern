package com.mxz.StrategyPattern;

/**
 * Created by Administrator on 2019/9/4.
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行！");
    }
}
