package com.mxz.ChainofResponsibilityPattern.common;

/**
 * Created by Administrator on 2019/9/9.
 */
public class Father implements IHandler {
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("女儿的请示是："+women.getRequest());
        System.out.println("父亲的答复是:同意");
    }
}
